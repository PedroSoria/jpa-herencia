package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.AttributesUser1;

@RepositoryRestResource
public interface Attributes1Repository extends JpaRepository<AttributesUser1, Long> {

}
