package com.machool.shipment.converter;

import com.machool.shipment.model.NonContractShipmentTO;

import ca.canadapost.cpcdp.ncshipping.generated.ncshipment.NonContractShipment;

public class NonContractShipmentConverter {
	public static NonContractShipment toEntity(final NonContractShipmentTO resource) {
		final NonContractShipment entidy = new NonContractShipment();
		entidy.setRequestedShippingPoint(resource.getRequestedShippingPoint());
		if (resource.getDeliverySpec() != null)
			entidy.setDeliverySpec(DeliverySpecConverter.toEntity(resource.getDeliverySpec()));
		return entidy;
	}
}
