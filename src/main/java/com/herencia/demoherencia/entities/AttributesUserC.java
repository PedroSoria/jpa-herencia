package com.herencia.demoherencia.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "other_attribute2")
public class AttributesUserC implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne
    protected UserC userC;

    @Column(nullable = false)
    String otherAttributeName4;
    @Column(nullable = false)
    String otherAttributeName5;
    @Column(nullable = false)
    String otherAttributeName6;
}