package com.herencia.demoherencia.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "other_user")
public class OtherUser extends User {

    @OneToOne
    protected OtherAttribute otherAttribute;

}
