package com.herencia.demoherencia.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class UserB extends UserA {
    @Column(nullable = false)
    String otherAttributeName1;

    @Column(nullable = false)
    String otherAttributeName2;

    @Column(nullable = false)
    String otherAttributeName3;
}
