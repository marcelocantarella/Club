package com.club.clubcontrol.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "user_type")
public class UserType {

    @Id
    @Column(nullable = false, updatable = false, name = "id_usuar_type")
    @GeneratedValue
    private Integer idUserType;

    @Column(nullable = false, name = "tipo")
    private String tipo;

}
