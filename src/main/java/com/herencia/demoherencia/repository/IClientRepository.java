package com.herencia.demoherencia.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.model.Client;
import com.herencia.demoherencia.projection.IClientProjection;

@RepositoryRestResource(excerptProjection = IClientProjection.class)
public interface IClientRepository extends JpaRepository<Client, Long> {

    Page<Client> findByEmailContaining(@Param("email") String email, Pageable pageable);

}
