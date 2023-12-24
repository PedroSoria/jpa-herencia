package com.herencia.demoherencia.projection;

import org.springframework.data.rest.core.config.Projection;
import com.herencia.demoherencia.model.GroupPolicy;

@Projection(name = "grou_policy_projection", types = { GroupPolicy.class })
public interface GrouPolicyProjection {

    String getName();

}
