package com.machool.shipment.converter;

import com.machool.shipment.model.DestinationAddressTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.DestinationAddressDetailsType;

public class DestinationAddressConverter {
	public static DestinationAddressDetailsType toEntity(final DestinationAddressTO resource) {
		final DestinationAddressDetailsType entidy = new DestinationAddressDetailsType();
		entidy.setAddressLine1(resource.getAddressLine1());
		entidy.setAddressLine2(resource.getAddressLine2());
		entidy.setCity(resource.getCity());
		entidy.setCountryCode(resource.getCountryCode());
		entidy.setPostalZipCode(resource.getPostalZipCode());
		entidy.setProvState(resource.getProvState());
		return entidy;
	}
}
