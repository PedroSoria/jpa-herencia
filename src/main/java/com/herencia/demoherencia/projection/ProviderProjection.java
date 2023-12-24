package com.herencia.demoherencia.projection;

import org.springframework.data.rest.core.config.Projection;
import com.herencia.demoherencia.model.Provider;

@Projection(name = "provider_projection", types = { Provider.class })
public interface ProviderProjection extends ClientProjection {

    String getBrand();

}
