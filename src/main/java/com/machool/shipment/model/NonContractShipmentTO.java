package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class NonContractShipmentTO {
	
	private static final long serialVersionUID = 1L;
	 
	@Id
	@GeneratedValue
	private Long id;
	
	private String shipmentID;
	private String TrackingPin;
	
    private String requestedShippingPoint;
    @OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@NotNull
	private DeliverySpecTO deliverySpec;
    
    
	public String getTrackingPin() {
		return TrackingPin;
	}
	public void setTrackingPin(String trackingPin) {
		TrackingPin = trackingPin;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShipmentID() {
		return shipmentID;
	}
	public void setShipmentID(String shipmentID) {
		this.shipmentID = shipmentID;
	}
	public String getRequestedShippingPoint() {
		if (requestedShippingPoint == null)
			this.requestedShippingPoint = this.getDeliverySpec().getSender().getAddressDetails().getPostalZipCode();
		return requestedShippingPoint;
	}
	public void setRequestedShippingPoint(String requestedShippingPoint) {
		this.requestedShippingPoint = requestedShippingPoint;
	}
	public DeliverySpecTO getDeliverySpec() {
		return deliverySpec;
	}
	public void setDeliverySpec(DeliverySpecTO deliverySpec) {
		this.deliverySpec = deliverySpec;
	}
	
}
