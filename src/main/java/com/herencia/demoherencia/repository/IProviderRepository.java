package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.model.Provider;

@RepositoryRestResource
public interface IProviderRepository extends JpaRepository<Provider, Long> {

}
