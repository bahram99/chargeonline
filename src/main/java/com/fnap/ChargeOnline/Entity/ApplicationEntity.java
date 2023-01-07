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
@Table(name = "T_APPLICATION")
public class ApplicationEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ApplicationGenerator")
    @SequenceGenerator(name = "ApplicationGenerator", sequenceName = "Application_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;


    @Column(name = "C_NAME")
    private String name;

    @Column(name = "C_CODE")
    private Integer code;

    @Column(name = "C_PREFIX")
    private Integer mpaadPrefix;

    @Column(name = "C_CHARGEEVACUATIONURL")
    private String chargeEvacuationUrl;

    @Column(name = "C_ACTIVE")
    private Boolean active;

    @Column(name = "C_EVACUATION_USERNAME")
    private String evacuationUsername;

    @Column(name = "C_EVACUATION_PASSWORD")
    private String evacuationPassword;

}
