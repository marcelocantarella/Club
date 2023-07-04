package com.club.clubcontrol.domain.club;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "service_club")
public class ServiceClub {

    @Id
    @Column(nullable = false, updatable = false, name = "id_service")
    @GeneratedValue
    private Integer idService;

    @Column(nullable = false, name = "servicio")
    private String servicio;

    @Column(name = "costo_extra")
    private Integer costoExtra;

}
