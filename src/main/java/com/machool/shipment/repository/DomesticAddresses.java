package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.DomesticAddressTO;

public interface DomesticAddresses extends JpaRepository<DomesticAddressTO, Long> {

}
