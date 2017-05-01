package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.SenderTO;

public interface Senderes extends JpaRepository<SenderTO, Long> {

}
