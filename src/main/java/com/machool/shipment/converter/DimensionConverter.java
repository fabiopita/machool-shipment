package com.machool.shipment.converter;

import com.machool.shipment.model.DimensionTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.ParcelCharacteristicsType.Dimensions;

public class DimensionConverter {
	public static Dimensions toEntity(final DimensionTO resource) {
		final Dimensions entidy = new Dimensions();
		entidy.setLength(resource.getLength());
		entidy.setWidth(resource.getWidth());
		entidy.setHeight(resource.getHeight());
		
		return entidy;
	}
}
