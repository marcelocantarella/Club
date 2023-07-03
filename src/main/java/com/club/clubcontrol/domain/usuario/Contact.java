package com.club.clubcontrol.domain.usuario;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "contact")
public class Contact {

    @Id
    @Column(nullable = false, updatable = false, name = "id_conntact")
    @GeneratedValue
    private Integer idContact;

    @Column(nullable = false, name = "nun_celular")
    private String celular;

    @Column(name = "mail")
    private String mail;

    public Integer getIdContact() {
        return idContact;
    }

    public void setIdContact(Integer idContact) {
        this.idContact = idContact;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
