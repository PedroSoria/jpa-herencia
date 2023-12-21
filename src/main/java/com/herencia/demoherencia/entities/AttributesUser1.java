package com.herencia.demoherencia.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class AttributesUser1 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long idAttributesUser1;

    @OneToOne
    protected User1 user1;

    @Column(nullable = false)
    String otherAttributeName1;

    @Column(nullable = false)
    String otherAttributeName2;

}
