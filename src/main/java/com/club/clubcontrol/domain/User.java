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
    private String pass;

    @Column(nullable = false, name = "id_user_info")
    private String idUserInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getIdUserInfo() {
        return idUserInfo;
    }

    public void setIdUserInfo(String idUserInfo) {
        this.idUserInfo = idUserInfo;
    }
}
