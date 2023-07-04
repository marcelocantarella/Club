package com.club.clubcontrol.domain.club;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "club")
public class Club {

    @Id
    @Column(nullable = false, updatable = false, name = "id_club")
    @GeneratedValue
    private Integer idClub;

    @Column(nullable = false, name = "nombre")
    private String nombre;

    @Column(nullable = false, name = "fecha_creacion")
    private String fechaCreacion;

    @Column(nullable = false, name = "id_service")
    private String idService;

    @Column(nullable = false, name = "id_user_info")
    private String idUserInfo;

    public Integer getIdClub() {
        return idClub;
    }
    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    public String getIdUserInfo() {
        return idUserInfo;
    }

    public void setIdUserInfo(String idUserInfo) {
        this.idUserInfo = idUserInfo;
    }
}
