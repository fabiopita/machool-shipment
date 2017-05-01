package com.machool.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class OptionTO {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String optionCode;
	private BigDecimal optionAmount;
	private Boolean optionQualifier1;
	private String optionQualifier2;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getOptionCode() {
		return optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}
	public BigDecimal getOptionAmount() {
		return optionAmount;
	}
	public void setOptionAmount(BigDecimal optionAmount) {
		this.optionAmount = optionAmount;
	}
	public Boolean getOptionQualifier1() {
		return optionQualifier1;
	}
	public void setOptionQualifier1(Boolean optionQualifier1) {
		this.optionQualifier1 = optionQualifier1;
	}
	public String getOptionQualifier2() {
		return optionQualifier2;
	}
	public void setOptionQualifier2(String optionQualifier2) {
		this.optionQualifier2 = optionQualifier2;
	}
	
	
}
