package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.DeliverySpecTO;

public interface DeliverySpecs extends JpaRepository<DeliverySpecTO, Long> {

}
