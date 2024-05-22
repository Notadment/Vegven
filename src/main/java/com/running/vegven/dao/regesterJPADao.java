package com.running.vegven.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.running.vegven.model.Userinf;

public interface regesterJPADao extends JpaRepository<Userinf, String> {

}
