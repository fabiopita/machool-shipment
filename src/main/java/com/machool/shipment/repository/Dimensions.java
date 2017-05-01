package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.DimensionTO;

public interface Dimensions extends JpaRepository<DimensionTO, Long> {

}
