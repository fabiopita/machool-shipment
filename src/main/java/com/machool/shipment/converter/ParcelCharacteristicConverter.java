package com.machool.shipment.converter;

import com.machool.shipment.model.ParcelCharacteristicTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.ParcelCharacteristicsType;

public class ParcelCharacteristicConverter {
	public static ParcelCharacteristicsType toEntity(final ParcelCharacteristicTO resource) {
		final ParcelCharacteristicsType entidy = new ParcelCharacteristicsType(); 
		entidy.setWeight(resource.getWeight());
		entidy.setDocument(resource.getDocument());
		entidy.setUnpackaged(resource.getUnpackaged());
		entidy.setMailingTube(resource.getMailingTube());
		return entidy;
	}
}
