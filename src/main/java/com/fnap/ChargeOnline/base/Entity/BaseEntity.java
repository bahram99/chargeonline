package com.fnap.ChargeOnline.base.Entity;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity implements GenericEntity {

    protected Long id;

    @Override
    public BaseEntity clone() throws CloneNotSupportedException {
        return (BaseEntity) super.clone();
    }
}
