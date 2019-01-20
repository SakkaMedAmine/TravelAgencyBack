package com.tab.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tab.tn.entities.Transport;

public interface TransportRepository extends JpaRepository<Transport, Long> {

}
