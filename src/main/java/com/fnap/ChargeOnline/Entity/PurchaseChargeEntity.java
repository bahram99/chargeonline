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
@Table(name = "t_PurchaseCharge")
public class PurchaseChargeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PurchaseChargeGenerator")
    @SequenceGenerator(name = "PurchaseChargeGenerator", sequenceName = "PurchaseCharge_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;


    @Column(name = "c_purchaseIdentifier")
    private String purchaseIdentifier;

    @Column(name = "c_receiveDate")
    private Date receiveDate;

    @Column(name = "c_amount")
    private Double amount;

    @Column(name = "c_isEvacuate")
    private Boolean isEvacuate;

    @Column(name = "c_purchaseChargeDate")
    private Date purchaseChargeDate;

    @Column(name = "c_evacuateDate")
    private Date evacuateDate;

    @Column(name = "c_amountCode")
    private String amountCode;

    @Transient
    private String userName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_user")
    private ChargeMobileUserEntity chargeMobileUser;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "purchaseCharge")
    private List<PurchaseStateHistoryEntity> purchaseStateHistoryList;

    @ManyToOne
    @JoinColumn(name = "fk_application")
    private ApplicationEntity application;

    @Column(name = "c_mobileNumber")
    private String mobileNumber;

    private PurchaseStateEnum currentPurchaseState;

    @Column(name = "c_incentive_charge")
    private Integer incentiveCharge;
}
