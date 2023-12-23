package com.herencia.demoherencia.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Client extends User {
    @Column(nullable = false)
    String address;
}
