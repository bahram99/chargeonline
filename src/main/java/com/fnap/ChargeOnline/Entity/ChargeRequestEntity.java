package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_ChargeRequest")
public class ChargeRequestEntity extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChargeRequestGenerator")
    @SequenceGenerator(name = "ChargeRequestGenerator", sequenceName = "ChargeRequest_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;

    @Column(name = "c_traceCode")
    private String traceCode;

    @Column(name = "c_changeDate")
    private Date changeDate;

    @Column(name = "c_creationDate")
    private Date creationDate;

    @Column(name = "c_changeState")
    private Integer changeState;

    @Column(name = "c_mobileNumber")
    private String mobileNumber;

    @Column(name = "c_empadCode")
    private String empadCode;

    @Column(name = "c_amount")
    private Double amount;
    private String amountCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_user")
    private ChargeMobileUserEntity chargeMobileUser;

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "chargeRequest")
    @Cascade(value = org.hibernate.annotations.CascadeType.ALL)
    private List<ChargeRequestStateEntity> chargeRequestStateList;

    @Column(name = "c_chargeList")
    private String chargeList;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_chargeProduct")
    private ChargeProductEntity chargeProduct;

    @Column(name = "c_referenceNumber")
    private String referenceNumber;

    @Column(name = "c_applicationCode")
    private Integer applicationCode;

    @Column(name = "c_transactionId")
    private String transactionId;
}
