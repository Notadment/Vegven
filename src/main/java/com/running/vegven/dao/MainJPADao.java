package com.running.vegven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.running.vegven.model.Production;

public interface MainJPADao extends JpaRepository<Production, Integer>{
	
}
