package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herencia.demoherencia.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
