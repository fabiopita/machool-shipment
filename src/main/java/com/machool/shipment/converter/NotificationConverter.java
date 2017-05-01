package com.machool.shipment.converter;

import com.machool.shipment.model.NotificationTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.NotificationType;

public class NotificationConverter {
	public static NotificationType toEntity(final NotificationTO resource) {
		final NotificationType entidy = new NotificationType();
		entidy.setEmail(resource.getEmail());
		entidy.setOnShipment(resource.isOnShipment());
		entidy.setOnException(resource.isOnException());
		entidy.setOnDelivery(resource.isOnDelivery());
		return entidy;
	}
}
