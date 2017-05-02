package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SenderTO implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String company;
	private String contactPhone;
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	//@NotNull
    private DomesticAddressTO addressDetails;
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
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public DomesticAddressTO getAddressDetails() {
		return addressDetails;
	}
	public void setAddressDetails(DomesticAddressTO addressDetails) {
		this.addressDetails = addressDetails;
	}
	
}
