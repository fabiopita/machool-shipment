package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.ReferenceTO;

public interface References extends JpaRepository<ReferenceTO, Long> {

}
