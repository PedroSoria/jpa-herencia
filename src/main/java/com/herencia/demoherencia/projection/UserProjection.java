package com.herencia.demoherencia.projection;

import java.util.List;
import org.springframework.data.rest.core.config.Projection;
import com.herencia.demoherencia.model.GroupPolicy;
import com.herencia.demoherencia.model.User;

@Projection(types = { User.class })
public interface UserProjection {

    String getEmail();

    List<GroupPolicy> getGroupolicys();

}
