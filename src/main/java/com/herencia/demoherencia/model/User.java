package com.herencia.demoherencia.model;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "_user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long idUser;

    @Column(unique = true, nullable = false)
    protected String email;

    // @JsonIgnore
    @Column(nullable = false)
    protected String password;

    @ManyToMany
    List<GroupPolicy> groupolicys;

}
