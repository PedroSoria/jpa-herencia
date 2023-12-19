package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.herencia.demoherencia.entities.OtherUser2;

@RepositoryRestResource
public interface OtherUser2Repository extends JpaRepository<OtherUser2, Long> {

}
