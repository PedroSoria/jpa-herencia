package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.AttributesUserB;

@RepositoryRestResource
public interface OtherAttributesBRepository extends JpaRepository<AttributesUserB, Long> {

}
