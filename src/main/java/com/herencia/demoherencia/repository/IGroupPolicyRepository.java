package com.herencia.demoherencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.herencia.demoherencia.model.GroupPolicy;

@RepositoryRestResource(excerptProjection = GroupPolicy.class)
public interface IGroupPolicyRepository extends JpaRepository<GroupPolicy, Long> {

}
