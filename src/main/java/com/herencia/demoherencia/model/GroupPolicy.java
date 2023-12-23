package com.herencia.demoherencia.model;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.*;

@Data
@Entity
public class GroupPolicy implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idGroupPolicy;

    @Column(nullable = false)
    String name;

}