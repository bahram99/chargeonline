package com.fnap.ChargeOnline.Entity;


import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "T_ZONE")
public class ZoneEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ZoneGenerator")
    @SequenceGenerator(name = "ZoneGenerator", sequenceName = "Zone_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;

    @Column(name = "C_NAME")
    private String name;

    @Column(name = "C_CODE")
    private Integer code;

    @Column(name = "C_DESCRIPTION")
    private String description;

    @Column(name = "C_ACTIVE")
    private Boolean active;

    @Column(name = "C_PRICE")
    private Integer price;

}
