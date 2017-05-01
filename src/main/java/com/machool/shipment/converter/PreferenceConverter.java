package com.machool.shipment.converter;

import com.machool.shipment.model.PreferenceTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.PreferencesType;

public class PreferenceConverter {
	public static PreferencesType toEntity(final PreferenceTO resource) {
		final PreferencesType entidy = new PreferencesType();
		entidy.setShowPackingInstructions(resource.isShowPackingInstructions());
		entidy.setShowPostageRate(resource.getShowPostageRate());
		entidy.setShowInsuredValue(resource.getShowInsuredValue());
		return entidy;
	}
}
