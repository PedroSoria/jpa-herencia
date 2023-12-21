package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.User1;

@RepositoryRestResource
public interface User1Repository extends JpaRepository<User1, Long> {

}
