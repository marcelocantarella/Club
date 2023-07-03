package com.club.clubcontrol.domain;

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

}
