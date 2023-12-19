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
public class OtherAttributes2 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "otherattribute_sequence")
    @SequenceGenerator(name = "otherattribute_sequence", sequenceName = "otherattribute_sequence", allocationSize = 100)
    Long id;

    @OneToOne
    protected OtherUser2 otherUser2;

    String otherAttributeName4;
    String otherAttributeName5;
    String otherAttributeName6;
}