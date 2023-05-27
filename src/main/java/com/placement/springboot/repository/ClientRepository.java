package com.placement.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.springboot.model.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{

}
