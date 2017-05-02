package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ReferenceTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String costCentre;
	private String customerRef1;
	private String customerRef2;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCostCentre() {
		return costCentre;
	}
	public void setCostCentre(String costCentre) {
		this.costCentre = costCentre;
	}
	public String getCustomerRef1() {
		return customerRef1;
	}
	public void setCustomerRef1(String customerRef1) {
		this.customerRef1 = customerRef1;
	}
	public String getCustomerRef2() {
		return customerRef2;
	}
	public void setCustomerRef2(String customerRef2) {
		this.customerRef2 = customerRef2;
	}
	
	
}
