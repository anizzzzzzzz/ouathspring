package com.springsecurity.ouath.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurity.ouath.model.Userr;

public interface UserRepository extends JpaRepository<Userr, Long> {
	
	Userr findByUsername(String username);

}
