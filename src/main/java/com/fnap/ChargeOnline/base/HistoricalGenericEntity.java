package com.fnap.ChargeOnline.base;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class HistoricalGenericEntity extends BaseEntity {

    @Column(name = "c_fromDate")
    private Date fromDate;

    @Column(name = "c_toDate")
    private Date toDate;

    @Column(name = "c_active")
    private Boolean active;


}
