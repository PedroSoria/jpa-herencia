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
@Table(name = "other_attribute")
public class OtherAttribute implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "otherattribute_sequence")
    @SequenceGenerator(name = "otherattribute_sequence", sequenceName = "otherattribute_sequence", allocationSize = 100)
    Long id;

    String otherAttributeName;
}