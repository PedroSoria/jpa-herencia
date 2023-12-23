package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.herencia.demoherencia.model.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

}
