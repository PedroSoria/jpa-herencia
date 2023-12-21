package com.herencia.demoherencia.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@Entity
public class GroupPolicy implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

}