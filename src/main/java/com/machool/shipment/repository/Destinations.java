package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.DestinationTO;

public interface Destinations extends JpaRepository<DestinationTO, Long> {

}
