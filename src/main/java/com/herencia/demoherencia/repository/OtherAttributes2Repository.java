package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.OtherAttributes2;

@RepositoryRestResource
public interface OtherAttributes2Repository extends JpaRepository<OtherAttributes2, Long> {

}
