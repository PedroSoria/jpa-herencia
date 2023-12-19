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
@Table(name = "other_attribute1")
public class OtherAttributes1 implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "otherattribute_sequence")
    @SequenceGenerator(name = "otherattribute_sequence", sequenceName = "otherattribute_sequence", allocationSize = 100)
    Long id;

    @OneToOne
    protected OtherUser1 otherUser1;

    String otherAttributeName1;
    String otherAttributeName2;
    String otherAttributeName3;
}