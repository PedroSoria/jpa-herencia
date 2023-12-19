package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.herencia.demoherencia.entities.OtherUser1;

@RepositoryRestResource
public interface OtherUser1Repository extends JpaRepository<OtherUser1, Long> {

}
