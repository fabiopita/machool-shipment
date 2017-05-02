package com.machool.shipment.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ParcelCharacteristicTO implements Serializable  {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private BigDecimal weight;
	private Boolean document;
	private Boolean unpackaged;
	private Boolean mailingTube;
	
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	//@NotNull
	private DimensionTO dimensions;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getWeight() {
		return weight;
	}
	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}
	public DimensionTO getDimensions() {
		return dimensions;
	}
	public void setDimensions(DimensionTO dimensions) {
		this.dimensions = dimensions;
	}
	public Boolean getDocument() {
		return document;
	}
	public void setDocument(Boolean document) {
		this.document = document;
	}
	public Boolean getUnpackaged() {
		return unpackaged;
	}
	public void setUnpackaged(Boolean unpackaged) {
		this.unpackaged = unpackaged;
	}
	public Boolean getMailingTube() {
		return mailingTube;
	}
	public void setMailingTube(Boolean mailingTube) {
		this.mailingTube = mailingTube;
	}
	
}
