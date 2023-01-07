package com.fnap.ChargeOnline.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_charge")
public class ChargeTransactionEntity extends CardTransactionEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChargeTransactionGenerator")
    @SequenceGenerator(name = "ChargeTransactionGenerator", sequenceName = "ChargeTransaction_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;


    @Column(name = "c_chargePurchaseIdentifier")
    private Long chargePurchaseIdentifier;

    @Column(name = "C_APPLICATIONVERSION")
    private String applicationVersion;

    @Column(name = "c_incentiveCharge")
    protected Integer incentiveCharge;


}
