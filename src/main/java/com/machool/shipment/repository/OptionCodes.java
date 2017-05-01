package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.Option;

public interface OptionCodes extends JpaRepository<Option, Long> {

}
