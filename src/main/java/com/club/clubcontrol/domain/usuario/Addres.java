package com.club.clubcontrol.domain.usuario;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "addres")
public class Addres {

    @Id
    @Column(nullable = false, updatable = false, name = "id_usuar_type")
    @GeneratedValue
    private Integer idUserType;

    @Column(nullable = false, name = "calle")
    private String calle;

    @Column(name = "barrio")
    private String barrio;

    @Column(nullable = false, name = "numero")
    private Integer numero;

    @Column(name = "piso")
    private Integer piso;

    @Column(name = "dpto")
    private String dpto;

    @Column(nullable = false, name = "localidad")
    private String localidad;

    @Column(name = "cod_post")
    private String codPost;

    public Integer getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(Integer idUserType) {
        this.idUserType = idUserType;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getPiso() {
        return piso;
    }

    public void setPiso(Integer piso) {
        this.piso = piso;
    }

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCodPost() {
        return codPost;
    }

    public void setCodPost(String codPost) {
        this.codPost = codPost;
    }
}
