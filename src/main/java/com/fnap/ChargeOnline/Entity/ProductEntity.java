package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

@AllArgsConstructor
@NoArgsConstructor
@Data
@MappedSuperclass
public class ProductEntity extends BaseEntity {

    @Column(name = "C_CODE")
    private Integer code;

    @Column(name = "C_PRICE")
    private Integer price;

    @Column(name = "C_PURCHASECODE")
    private Integer purchaseCode;

    @Column(name = "C_NAME")
    private String name;

    @ManyToOne()
    @JoinColumn(name = "FK_APPLICATION")
    private ApplicationEntity application;

    @Override
    public Long getId() {
        return null;
    }

    @Override
    public void setId(Long id) {

    }
}
