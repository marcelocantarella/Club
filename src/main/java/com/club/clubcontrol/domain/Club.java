package com.club.clubcontrol.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "club")
public class Club {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue
    private Integer id;

    @Column(nullable = false, name = "nombre")
    private String nombre;

    @Column(nullable = false, name = "fecha_creacion")
    private String fechaCreacion;

    @Column(nullable = false, name = "id_service")
    private String idService;

    @Column(nullable = false, name = "id_user_info")
    private String idUserInfo;

}
