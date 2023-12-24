package com.herencia.demoherencia.projection;

import org.springframework.data.rest.core.config.Projection;
import com.herencia.demoherencia.model.Provider;

@Projection(types = { Provider.class })
public interface IProviderProjection extends IClientProjection {

    String getBrand();

}
