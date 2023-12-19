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
public class AttributesUserB implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "otherattribute_sequence")
    @SequenceGenerator(name = "otherattribute_sequence", sequenceName = "otherattribute_sequence", allocationSize = 100)
    Long id;

    @OneToOne
    protected UserB userB;

    @Column(nullable = false)
    String otherAttributeName1;
    @Column(nullable = false)
    String otherAttributeName2;
    @Column(nullable = false)
    String otherAttributeName3;
}