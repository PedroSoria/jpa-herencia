package com.herencia.demoherencia.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public final class Provider extends Client {
    @Column(nullable = false)
    String brand;
}
