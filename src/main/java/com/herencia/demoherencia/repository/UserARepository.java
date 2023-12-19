package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.UserA;

@RepositoryRestResource
public interface UserARepository extends JpaRepository<UserA, Long> {

}
