package com.club.clubcontrol.domain.usuario;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "user_info")
public class UserInfo {

    @Id
    @Column(nullable = false, updatable = false, name = "id_usuar_data")
    @GeneratedValue
    private Integer idUserInfo;

    @Column(nullable = false, name = "id_personal_data")
    private String idPersonalData;

    @Column(nullable = false, name = "id_club_data")
    private String idClubData;

    @Column(nullable = false, name = "id_user_tipo")
    private String idUserType;

    public Integer getIdUserInfo() {
        return idUserInfo;
    }

    public void setIdUserInfo(Integer idUserInfo) {
        this.idUserInfo = idUserInfo;
    }

    public String getIdPersonalData() {
        return idPersonalData;
    }

    public void setIdPersonalData(String idPersonalData) {
        this.idPersonalData = idPersonalData;
    }

    public String getIdClubData() {
        return idClubData;
    }

    public void setIdClubData(String idClubData) {
        this.idClubData = idClubData;
    }

    public String getIdUserType() {
        return idUserType;
    }

    public void setIdUserType(String idUserType) {
        this.idUserType = idUserType;
    }
}
