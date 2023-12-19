package com.herencia.demoherencia.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class AttributesUserC implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idAttributesUserB;

    @OneToOne
    protected UserC userC;

    @Column(nullable = false)
    String otherAttributeName4;

    @Column(nullable = false)
    String otherAttributeName5;

    @Column(nullable = false)
    String otherAttributeName6;
}