package com.herencia.demoherencia.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "_user")
@Data
public class UserA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long idUser;

    @Column(unique = true, nullable = false)
    protected String email;

    @Column(nullable = false)
    protected String password;

    @ManyToMany
    List<GroupPolicy> groupolicys;
}
