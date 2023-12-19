package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.entities.UserB;

@RepositoryRestResource
public interface UserBRepository extends JpaRepository<UserB, Long> {

    // get all userB with extra dataB

}
