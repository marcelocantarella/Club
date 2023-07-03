package com.club.clubcontrol.domain.usuario;

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

    @Column(nullable = false, name = "type")
    private String type;

    public Integer getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(Integer idUserType) {
        this.idUserType = idUserType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
