package com.machool.shipment.converter;


import com.machool.shipment.model.DeliverySpecTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.DeliverySpecType;

public class DeliverySpecConverter {
	public static DeliverySpecType toEntity(final DeliverySpecTO resource) {
		final DeliverySpecType entidy = new DeliverySpecType();
		
		entidy.setServiceCode(resource.getServiceCode());
		if (resource.getSender() != null)
			entidy.setSender(SenderConverter.toEntity(resource.getSender()));
		if (resource.getDestination() != null)
			entidy.setDestination(DestinationConverter.toEntity(resource.getDestination()));
		if (resource.getOption() != null){
			entidy.setOptions(new DeliverySpecType.Options());
			entidy.getOptions().getOptions().add((OptionConverter.toEntity(resource.getOption())));
		}
		if (resource.getParcelCharacteristic() != null)
			entidy.setParcelCharacteristics(ParcelCharacteristicConverter.toEntity(resource.getParcelCharacteristic()));
		if (resource.getNotification() != null)
			entidy.setNotification(NotificationConverter.toEntity(resource.getNotification()));
		if (resource.getPreference() != null)
			entidy.setPreferences(PreferenceConverter.toEntity(resource.getPreference()));
		if (resource.getReference() != null)
			entidy.setReferences(ReferenceConverter.toEntity(resource.getReference()));
		
		return entidy;
	}
}
