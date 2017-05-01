package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DestinationAddressTO {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String addressLine1;
	private String addressLine2;
	private String city;
    private String provState;
    private String countryCode;
    private String postalZipCode;
    
    public String getFullAddress(){
    	return addressLine1 + " - " + postalZipCode + " " + city + " - " + provState + " - " + countryCode;
    }

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getProvState() {
		return provState;
	}
	public void setProvState(String provState) {
		this.provState = provState;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPostalZipCode() {
		return postalZipCode;
	}
	public void setPostalZipCode(String postalZipCode) {
		this.postalZipCode = postalZipCode;
	}
	
}
