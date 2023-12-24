package com.herencia.demoherencia.projection;

import org.springframework.data.rest.core.config.Projection;
import com.herencia.demoherencia.model.Client;

@Projection(types = { Client.class })
public interface ClientProjection extends UserProjection {

    String getAddress();

}