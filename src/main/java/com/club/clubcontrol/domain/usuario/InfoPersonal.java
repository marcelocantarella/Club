package com.club.clubcontrol.domain.usuario;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name= "info_personal")
public class InfoPersonal {

    @Id
    @Column(nullable = false, updatable = false, name = "id_personal_data")
    @GeneratedValue
    private Integer idPersonalData;

    @Column(nullable = false, name = "nombre")
    private String nombre;

    @Column(nullable = false, name = "apellido")
    private String apellido;

    @Column(name = "apodo")
    private String apodo;

    @Column(nullable = false, name = "dni")
    private Double dni;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacimiento;

    @Column(nullable = false, name = "id_addres")
    private Integer idAddres;

    @Column(nullable = false, name = "id_contact")
    private Integer idContact;

    public Integer getIdPersonalData() {
        return idPersonalData;
    }

    public void setIdPersonalData(Integer idPersonalData) {
        this.idPersonalData = idPersonalData;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public Double getDni() {
        return dni;
    }

    public void setDni(Double dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getIdAddres() {
        return idAddres;
    }

    public void setIdAddres(Integer idAddres) {
        this.idAddres = idAddres;
    }

    public Integer getIdContact() {
        return idContact;
    }

    public void setIdContact(Integer idContact) {
        this.idContact = idContact;
    }
}
