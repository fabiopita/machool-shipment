package com.machool.shipment.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.machool.shipment.converter.NonContractShipmentConverter;
import com.machool.shipment.model.NonContractShipmentTO;
import com.machool.shipment.repository.NonContractShipments;
import com.machool.shipment.repository.OptionCodes;
import com.machool.shipment.repository.ProvencesCA;
import com.machool.shipment.server.CountryClientWS;
import com.machool.shipment.server.NCShipmentClientWS;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.NonContractShipment;
import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.NonContractShipmentInfo;


@Controller
public class NonContractShipmentsController {
	
	@Autowired
	private NonContractShipments nonContractShipments;
	
	@Autowired
	private OptionCodes optionCodes;
	
	@Autowired
	private ProvencesCA provencesCA;  
	
	@GetMapping("/listNonContractShipments")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("listNonContractShipments");
		modelAndView.addObject("nonContractShipments", nonContractShipments.findAll());
		return modelAndView;
	}
	
	@RequestMapping("/formNonContractShipment")
	public ModelAndView show() {
		ModelAndView modelAndView = new ModelAndView("formNonContractShipment");
		modelAndView.addObject(new NonContractShipmentTO());
		modelAndView.addObject("optionCodes", optionCodes.findAll());
		modelAndView.addObject("provencesCA", provencesCA.findAll());
		
		return modelAndView;
	}
	
	@PostMapping("/formNonContractShipment")
	public ModelAndView save(NonContractShipmentTO nonContractShipment, RedirectAttributes redirectAttributes) {
		NonContractShipmentInfo nonContractShipmentInfo = new NonContractShipmentInfo();
		NCShipmentClientWS createNCShipmentClient = new NCShipmentClientWS();
		if (nonContractShipment.getDeliverySpec().getDestination().getAddress().getCountryCode().length() > 2){
			String countryCode = this.getAbbreviationCount(nonContractShipment.getDeliverySpec().getDestination().getAddress().getCountryCode());
			nonContractShipment.getDeliverySpec().getDestination().getAddress().setCountryCode(countryCode);
		}
		NonContractShipment shipment = NonContractShipmentConverter.toEntity(nonContractShipment);
		nonContractShipmentInfo = createNCShipmentClient.createNCS(shipment);
		if (nonContractShipmentInfo != null){
			nonContractShipment.setShipmentID(nonContractShipmentInfo.getShipmentId());
			nonContractShipment.setTrackingPin(nonContractShipmentInfo.getTrackingPin());
		}else
			nonContractShipment.setShipmentID("Error creating the shipment!");
		NCShipmentClientWS cl = new NCShipmentClientWS();
		cl.createNCS(shipment);
		this.nonContractShipments.save(nonContractShipment);
		return new ModelAndView("redirect:listNonContractShipments");
	}
	
	public String getAbbreviationCount(String countryName){
		CountryClientWS countryClientWS = new CountryClientWS();
		String country = countryClientWS.getCountryRest(countryName);
		return country;
	}
	
	

}
