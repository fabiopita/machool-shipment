package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.DestinationAddressTO;

public interface DestinationAddresses extends JpaRepository<DestinationAddressTO, Long> {

}
