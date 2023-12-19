package com.herencia.demoherencia.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class AttributesUserB implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idAttributesUserB;

    @OneToOne
    protected UserB userB;

    @Column(nullable = false)
    String otherAttributeName1;

    @Column(nullable = false)
    String otherAttributeName2;

    @Column(nullable = false)
    String otherAttributeName3;
}