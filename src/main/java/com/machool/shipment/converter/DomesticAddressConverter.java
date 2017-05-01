package com.machool.shipment.converter;

import com.machool.shipment.model.DomesticAddressTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.DomesticAddressDetailsType;

public class DomesticAddressConverter {
	public static DomesticAddressDetailsType toEntity(final DomesticAddressTO resource) {
		final DomesticAddressDetailsType entidy = new DomesticAddressDetailsType(); 
		entidy.setAddressLine1(resource.getAddressLine1());
		entidy.setAddressLine2(resource.getAddressLine2());
		entidy.setCity(resource.getCity());
		entidy.setProvState(resource.getProvState());
		entidy.setPostalZipCode(resource.getPostalZipCode());
		return entidy;
	}
}
