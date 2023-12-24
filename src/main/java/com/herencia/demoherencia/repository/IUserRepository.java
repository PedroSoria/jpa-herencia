package com.herencia.demoherencia.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.model.User;
import com.herencia.demoherencia.projection.IUserProjection;

@RepositoryRestResource(excerptProjection = IUserProjection.class)
public interface IUserRepository extends JpaRepository<User, Long> {

    Page<User> findByEmailContaining(@Param("email") String email, Pageable pageable);

}
