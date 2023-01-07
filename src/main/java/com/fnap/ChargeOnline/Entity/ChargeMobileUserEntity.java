package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_ChargeMobileUser")
public class ChargeMobileUserEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChargeMobileUserGenerator")
    @SequenceGenerator(name = "ChargeMobileUserGenerator", sequenceName = "ChargeMobileUser_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;


    @Column(name = "c_username", unique = false, nullable = false, length = 20)
    private String username;

    @Column(name = "c_lastname")
    private String lastname;

    @Column(name = "c_firstname")
    private String firstname;

    @Column(name = "c_password", unique = false, nullable = false, length = 10)
    private String password;

    @Column(name = "c_activityCode")
    private String activityCode;

    @Column(name = "c_sessionCode")
    private String sessionCode;

    @Column(name = "c_createDate")
    private Date createDate;

    @Column(name = "c_activation")
    private Boolean activation;

    @Column(name = "c_activationDate")
    private Date activationDate;

    private List<ChargeRequestEntity> chargeRequestList;

    @Column(name = "c_newpassword", unique = false, nullable = false, length = 10)
    private String newPassword;


    private ApplicationEntity application;

    @Column(name = "c_nationalid", unique = false, nullable = true, length = 20)
    private String nationalId;

    @Column(name = "c_pushurl")
    private String pushURL;

    @Column(name = "C_APPLICATIONVERSION")
    private String applicationVersion;
}
