package com.machool.shipment.converter;

import com.machool.shipment.model.DestinationTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.DestinationType;

public class DestinationConverter {
	public static DestinationType toEntity(final DestinationTO resource) {
		final DestinationType entidy = new DestinationType(); 
		entidy.setName(resource.getName());
		entidy.setCompany(resource.getCompany());
		entidy.setAdditionalAddressInfo(resource.getAdditionalAddressInfo());
		entidy.setClientVoiceNumber(resource.getClientVoiceNumber());
		if (resource.getAddress() != null)
			entidy.setAddressDetails(DestinationAddressConverter.toEntity(resource.getAddress()));
		return entidy;
	}
}
