package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.NonContractShipmentTO;

public interface NonContractShipments extends JpaRepository<NonContractShipmentTO, Long> {

}
