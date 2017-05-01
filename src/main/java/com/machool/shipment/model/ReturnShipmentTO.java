package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

public class ReturnShipmentTO {
	
	private static final long serialVersionUID = 1L;
	
	private int codStatus;
	private String ShipmentId;
	private String TrackingPin;
	private String errorCode;
	private String errorMSG;
	public int getCodStatus() {
		return codStatus;
	}
	public void setCodStatus(int codStatus) {
		this.codStatus = codStatus;
	}
	public String getShipmentId() {
		return ShipmentId;
	}
	public void setShipmentId(String shipmentId) {
		ShipmentId = shipmentId;
	}
	public String getTrackingPin() {
		return TrackingPin;
	}
	public void setTrackingPin(String trackingPin) {
		TrackingPin = trackingPin;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMSG() {
		return errorMSG;
	}
	public void setErrorMSG(String errorMSG) {
		this.errorMSG = errorMSG;
	}
		
}
