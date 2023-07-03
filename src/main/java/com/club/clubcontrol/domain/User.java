package com.club.clubcontrol.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "user")
public class User {

    @Id
    @Column(nullable = false, updatable = false, name = "id_usuarios")
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, name = "user_name")
    private String userName;

    @Column(nullable = false, name = "pass")
    private String fechaCreacion;

    @Column(nullable = false, name = "id_user_info")
    private String idService;

}
