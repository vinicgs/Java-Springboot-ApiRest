package com.apidepartamento.userdpt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apidepartamento.userdpt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
