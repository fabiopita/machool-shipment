package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NotificationTO {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String email;
	private boolean onShipment;
	private boolean onException;
	private boolean onDelivery;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isOnShipment() {
		return onShipment;
	}
	public void setOnShipment(boolean onShipment) {
		this.onShipment = onShipment;
	}
	public boolean isOnException() {
		return onException;
	}
	public void setOnException(boolean onException) {
		this.onException = onException;
	}
	public boolean isOnDelivery() {
		return onDelivery;
	}
	public void setOnDelivery(boolean onDelivery) {
		this.onDelivery = onDelivery;
	}
	
	
}
