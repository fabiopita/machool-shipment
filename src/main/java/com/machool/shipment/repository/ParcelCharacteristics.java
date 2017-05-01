package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.ParcelCharacteristicTO;

public interface ParcelCharacteristics extends JpaRepository<ParcelCharacteristicTO, Long> {

}
