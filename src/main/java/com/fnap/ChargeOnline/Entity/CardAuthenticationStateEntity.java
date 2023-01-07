package com.fnap.ChargeOnline.Entity;


import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "T_APPLICATION_SETTINGS")
public class CardAuthenticationStateEntity extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CardAuthenticationStateGenerator")
    @SequenceGenerator(name = "CardAuthenticationStateGenerator", sequenceName = "CardAuthenticationState_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;


    @Column(name = "c_active")
    private Boolean active;

    @Column(name = "c_authenticationDate")
    private Date authenticationDate;

    @Column(name = "c_sessionKey")
    private String sessionKey;

    @Column(name = "c_username")
    private String username;

    @Column(name = "c_oldAdminLog")
    private String oldAdminLog;

    @Column(name = "c_newAdminLog")
    private String newAdminLog;

    @Column(name = "c_cardSerialNumber")
    private String cardSerialNumber;

    // transit
    @Transient
    private String MAC;
    @Transient
    private String remainedCredit;
    @Transient
    private String status;
    @Transient
    private String code;
    @Transient
    private String randB;

}
