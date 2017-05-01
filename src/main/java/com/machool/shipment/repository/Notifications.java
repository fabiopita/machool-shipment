package com.machool.shipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.machool.shipment.model.NotificationTO;

public interface Notifications extends JpaRepository<NotificationTO, Long> {

}
