package com.machool.shipment.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class DeliverySpecTO {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String serviceCode = "DOM.EP";
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@NotNull
	private SenderTO sender;
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@NotNull
	private DestinationTO destination;
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@NotNull
	private OptionTO  option;
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@NotNull
	private ParcelCharacteristicTO parcelCharacteristic;
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@NotNull
	private NotificationTO notification;
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	@NotNull
	private PreferenceTO preference;
	@OneToOne(cascade=CascadeType.PERSIST, orphanRemoval=true)
	//@NotNull
	private ReferenceTO reference;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public SenderTO getSender() {
		return sender;
	}
	public void setSender(SenderTO sender) {
		this.sender = sender;
	}
	public DestinationTO getDestination() {
		return destination;
	}
	public void setDestination(DestinationTO destination) {
		this.destination = destination;
	}
	public OptionTO getOption() {
		return option;
	}
	public void setOption(OptionTO option) {
		this.option = option;
	}
	public ParcelCharacteristicTO getParcelCharacteristic() {
		return parcelCharacteristic;
	}
	public void setParcelCharacteristic(ParcelCharacteristicTO parcelCharacteristic) {
		this.parcelCharacteristic = parcelCharacteristic;
	}
	public NotificationTO getNotification() {
		return notification;
	}
	public void setNotification(NotificationTO notification) {
		this.notification = notification;
	}
	public PreferenceTO getPreference() {
		return preference;
	}
	public void setPreference(PreferenceTO preference) {
		this.preference = preference;
	}
	public ReferenceTO getReference() {
		return reference;
	}
	public void setReference(ReferenceTO reference) {
		this.reference = reference;
	}
	
	
}
