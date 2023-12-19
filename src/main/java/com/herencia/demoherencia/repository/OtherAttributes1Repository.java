package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.OtherAttributes1;

@RepositoryRestResource
public interface OtherAttributes1Repository extends JpaRepository<OtherAttributes1, Long> {

}
