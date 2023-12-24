package com.herencia.demoherencia.projection;

import org.springframework.data.rest.core.config.Projection;
import com.herencia.demoherencia.model.Client;

@Projection(name = "client_projection", types = { Client.class })
public interface ClientProjection extends UserProjection {

    String getAddress();

}