package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.HistoricalGenericEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_PurchaseStateHistory")
public class PurchaseStateHistoryEntity extends HistoricalGenericEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PurchaseStateHistoryGenerator")
    @SequenceGenerator(name = "PurchaseStateHistoryGenerator", sequenceName = "PurchaseStateHistory_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fk_purchaseCharge")
    private PurchaseChargeEntity purchaseCharge;

    /*@Enumerated(EnumType.ORDINAL)
    @Column(name = "c_state")
    private PurchaseStateEnum state;*/
}
