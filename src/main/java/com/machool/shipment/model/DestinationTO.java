package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class DestinationTO implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String company;
    private String additionalAddressInfo;
    private String clientVoiceNumber;
    @OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	//@NotNull
    protected DestinationAddressTO  address;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAdditionalAddressInfo() {
		return additionalAddressInfo;
	}
	public void setAdditionalAddressInfo(String additionalAddressInfo) {
		this.additionalAddressInfo = additionalAddressInfo;
	}
	public String getClientVoiceNumber() {
		return clientVoiceNumber;
	}
	public void setClientVoiceNumber(String clientVoiceNumber) {
		this.clientVoiceNumber = clientVoiceNumber;
	}
	public DestinationAddressTO getAddress() {
		return address;
	}
	public void setAddress(DestinationAddressTO address) {
		this.address = address;
	}
	
}
