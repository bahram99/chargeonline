package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class AbstractMobileUserEntity extends BaseEntity {

    @Column(name = "C_USERNAME")
    private String username;

    @Column(name = "C_PASSWORD")
    private String password;

    @Column(name = "C_FIRSTNAME")
    private String firstName;

    @Column(name = "C_LASTNAME")
    private String lastName;

    @Column(name = "C_ACTIVITYCODE")
    private String activityCode;

    @Column(name = "C_CREATEDATE")
    private Date createDate;

    @Column(name = "C_ACTIVATED")
    private Boolean activated;

    @Column(name = "C_ACTIVATIONDATE")
    private Date activationDate;

    @Column(name = "C_NEWPASSWORD")
    private String newPassword;

    @ManyToOne()
    @JoinColumn(name = "FK_APPLICATION")
    private ApplicationEntity application;

}
