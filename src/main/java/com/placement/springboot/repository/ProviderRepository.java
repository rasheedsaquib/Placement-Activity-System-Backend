package com.placement.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.springboot.model.Provider;


public interface ProviderRepository extends JpaRepository<Provider, Long>{

}
