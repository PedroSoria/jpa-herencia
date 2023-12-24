package com.herencia.demoherencia.projection;

import org.springframework.data.rest.core.config.Projection;
import com.herencia.demoherencia.model.GroupPolicy;

@Projection(types = { GroupPolicy.class })
public interface IGrouPolicyProjection {

    String getName();

}
