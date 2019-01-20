package com.tab.tn.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tab.tn.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
