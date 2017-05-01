package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PreferenceTO {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private boolean showPackingInstructions;
	private Boolean showPostageRate;
	private Boolean showInsuredValue;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isShowPackingInstructions() {
		return showPackingInstructions;
	}
	public void setShowPackingInstructions(boolean showPackingInstructions) {
		this.showPackingInstructions = showPackingInstructions;
	}
	public Boolean getShowPostageRate() {
		return showPostageRate;
	}
	public void setShowPostageRate(Boolean showPostageRate) {
		this.showPostageRate = showPostageRate;
	}
	public Boolean getShowInsuredValue() {
		return showInsuredValue;
	}
	public void setShowInsuredValue(Boolean showInsuredValue) {
		this.showInsuredValue = showInsuredValue;
	}
	
	
	
}
