package com.machool.shipment.server;


import ca.canadapost.cpcdp.ncshipping.generated.messages.Messages;
import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.*;

import com.machool.shipment.model.ReturnShipmentTO;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;

import javax.xml.bind.JAXBContext;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class NCShipmentClientWS {

    private Client aClient;
    private static String LINK;
    private ReturnShipmentTO returnShipmentTO = new ReturnShipmentTO();
    NonContractShipmentInfo shipmentInfo;
    
    public NonContractShipmentInfo createNCS(NonContractShipment nonContractShipment) {    	
		
    	this.CreateClient();
        ClientResponse resp = this.createNCShipment(nonContractShipment);
        InputStream respIS = resp.getEntityInputStream();
        
        System.out.println("HTTP Response Status: " + resp.getStatus() + " " + resp.getClientResponseStatus());
        returnShipmentTO.setCodStatus(resp.getStatus());
        JAXBContext jc;
        try {
        	jc = JAXBContext.newInstance(NonContractShipmentInfo.class, Messages.class);
            Object entity = jc.createUnmarshaller().unmarshal(respIS);
            if (entity instanceof NonContractShipmentInfo) {
            	shipmentInfo = (NonContractShipmentInfo) entity;
            	System.out.println("Shipment ID: " + shipmentInfo.getShipmentId());
                for (Iterator<Link> iter = shipmentInfo.getLinks().getLinks().iterator(); iter.hasNext();) { 
                	Link aItem = (Link) iter.next();                	
	                System.out.println( aItem.getRel() + ": " + aItem.getHref());
                }
            } else {
                Messages messageData = (Messages) entity;
                for (Iterator<Messages.Message> iter = messageData.getMessage().iterator(); iter.hasNext();) {
                    Messages.Message aMessage = (Messages.Message) iter.next();
                    System.out.println("Error Code: " + aMessage.getCode());
                    System.out.println("Error Msg: " + aMessage.getDescription());
                }
            }
        } catch (Exception e) {
        	e.printStackTrace(System.out);
        }

        this.close();
        return shipmentInfo; 
    }

    public void CreateClient() {
    	Properties userProps = new Properties();
    	FileInputStream propInputStream;
		try {
			propInputStream = new FileInputStream("user.properties");
			userProps.load(propInputStream);
			propInputStream.close(); 
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
    	String username = userProps.getProperty("username");
    	String password = userProps.getProperty("password");
    	String mailedBy = userProps.getProperty("mailedBy");    	
    	
    	LINK = "https://ct.soa-gw.canadapost.ca/rs/" + mailedBy + "/ncshipment";
    	 
    	ClientConfig config = new DefaultClientConfig();
    	aClient = Client.create(config);
    	aClient.addFilter(new com.sun.jersey.api.client.filter.HTTPBasicAuthFilter(username, password));
    }

    public ClientResponse createNCShipment(Object xml) throws UniformInterfaceException {
        WebResource aWebResource = aClient.resource(LINK);
        return aWebResource.accept("application/vnd.cpc.ncshipment-v4+xml").header("Content-Type", "application/vnd.cpc.ncshipment-v4+xml").acceptLanguage("en-CA").post(ClientResponse.class, xml);
    }

    public void close() {
        aClient.destroy();
    }
    
}
