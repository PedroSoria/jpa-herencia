package com.herencia.demoherencia.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.model.Provider;

@RepositoryRestResource
public interface IProviderRepository extends JpaRepository<Provider, Long> {

    Page<Provider> findByEmailContaining(@Param("email") String email, Pageable pageable);
    // List<Provider> findByEmail(@Param("email") String email);
}
