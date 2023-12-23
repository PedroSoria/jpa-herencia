package com.herencia.demoherencia.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public final class UserC extends UserB {
    @Column(nullable = false)
    String otherAttributeName4;

    @Column(nullable = false)
    String otherAttributeName5;

    @Column(nullable = false)
    String otherAttributeName6;
}
