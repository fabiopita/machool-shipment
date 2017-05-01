package com.machool.shipment.converter;

import com.machool.shipment.model.OptionTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.OptionType;

public class OptionConverter {
	public static OptionType toEntity(final OptionTO resource) {
		final OptionType entidy = new OptionType(); 
		entidy.setOptionCode(resource.getOptionCode());
		entidy.setOptionAmount(resource.getOptionAmount());
		entidy.setOptionQualifier1(resource.getOptionQualifier1());
		entidy.setOptionQualifier2(resource.getOptionQualifier2());
		return entidy;
	}
}
