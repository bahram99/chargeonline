package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "T_CHARGEPRODUCT")
public class ChargeProductEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChargeProductGenerator")
    @SequenceGenerator(name = "ChargeProductGenerator", sequenceName = "ChargeProduct_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;


    @Column(name = "C_CHARGELIST")
    private String chargeList;

}
