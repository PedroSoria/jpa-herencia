package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.User;

@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {

}
