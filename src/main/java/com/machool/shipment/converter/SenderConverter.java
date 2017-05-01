package com.machool.shipment.converter;

import org.springframework.beans.factory.annotation.Autowired;

import com.machool.shipment.model.SenderTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.SenderType;;

public class SenderConverter {
	
	@Autowired
	DomesticAddressConverter domesticAddressConverter; 
	public static SenderType toEntity(final SenderTO resource) {
		final SenderType entidy = new SenderType(); 
		entidy.setName(resource.getName());
		entidy.setCompany(resource.getCompany());
		entidy.setContactPhone(resource.getContactPhone());
		if (resource.getAddressDetails() != null)
			entidy.setAddressDetails(DomesticAddressConverter.toEntity(resource.getAddressDetails()));
		return entidy;
	}
}
