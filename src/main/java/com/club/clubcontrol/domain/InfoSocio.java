package com.club.clubcontrol.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name= "info_socio")
public class InfoSocio {

    @Id
    @Column(nullable = false, updatable = false, name = "id_club_data")
    @GeneratedValue
    private Integer idClub;

    @Column(nullable = false, name = "numero_asociado")
    private Integer numeroAsociado;

    @Column(nullable = false, name = "fecha_asociacion")
    private Date fechaCreacion;

    @Column(name = "cod_grupo_fliar")
    private Integer codigoGrupoFliar;

    @Column(nullable = false, name = "fecha_asociacion")
    private Boolean estado;

    @Column(nullable = false, name = "id_servicios")
    private Integer idServicios;

    public InfoSocio() {
    }

    public InfoSocio(Integer idClub, Integer numeroAsociado, Date fechaCreacion, Integer codigoGrupoFliar, Boolean estado, Integer idServicios) {
        this.idClub = idClub;
        this.numeroAsociado = numeroAsociado;
        this.fechaCreacion = fechaCreacion;
        this.codigoGrupoFliar = codigoGrupoFliar;
        this.estado = estado;
        this.idServicios = idServicios;
    }

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public Integer getNumeroAsociado() {
        return numeroAsociado;
    }

    public void setNumeroAsociado(Integer numeroAsociado) {
        this.numeroAsociado = numeroAsociado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodigoGrupoFliar() {
        return codigoGrupoFliar;
    }

    public void setCodigoGrupoFliar(Integer codigoGrupoFliar) {
        this.codigoGrupoFliar = codigoGrupoFliar;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Integer getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(Integer idServicios) {
        this.idServicios = idServicios;
    }
}
