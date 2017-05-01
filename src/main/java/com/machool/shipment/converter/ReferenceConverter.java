package com.machool.shipment.converter;

import com.machool.shipment.model.ReferenceTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.ReferencesType;

public class ReferenceConverter {
	public static ReferencesType toEntity(final ReferenceTO resource) {
		final ReferencesType entidy = new ReferencesType();
		entidy.setCostCentre(resource.getCostCentre());
		entidy.setCustomerRef1(resource.getCustomerRef1());
		entidy.setCustomerRef2(resource.getCustomerRef2());
		return entidy;
	}
}
