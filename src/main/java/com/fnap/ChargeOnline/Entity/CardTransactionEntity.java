package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import com.fnap.ChargeOnline.base.enumeration.ActiveInactiveEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public abstract class CardTransactionEntity extends BaseEntity {

    @Column(name = "c_cardserialnumber")
    protected String cardSerialNumber;

    @Column(name = "c_adminlog", length = 1024)
    protected String adminLog;

    @Column(name = "c_amount")
    protected Long amount;

    @ManyToOne()
    @JoinColumn(name = "FK_USER")
    protected ChargeMobileUserEntity user;

    @Column(name = "c_occurrenceDate")
    protected Date occurrenceDate;

    @Column(name = "c_isSent")
    protected Boolean isSent;

    @Column(name = "c_verificationDate")
    protected Date verificationDate;

    @Column(name = "c_active")
    @Enumerated(value = EnumType.ORDINAL)
    protected ActiveInactiveEnum active;

    @Column(name = "c_remainedCredit")
    protected Integer remainedCredit;

    @ManyToOne()
    @JoinColumn(name = "FK_APPLICATION")
    protected ApplicationEntity application;

    @Column(name = "c_cardVersion")
    protected String cardVersion;

    @Column(name = "c_pan")
    protected String pan;

}
