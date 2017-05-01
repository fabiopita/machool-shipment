package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.OptionTO;

public interface Options extends JpaRepository<OptionTO, Long> {

}
