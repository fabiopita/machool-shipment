package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.PreferenceTO;

public interface Preferences extends JpaRepository<PreferenceTO, Long> {

}
