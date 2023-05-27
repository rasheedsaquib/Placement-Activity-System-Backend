package com.placement.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.springboot.model.Admin;


public interface AdminRepository extends JpaRepository<Admin, Long>{
	

}
