package com.fnap.ChargeOnline.base.Entity;

import java.io.Serializable;

public interface GenericEntity extends Serializable,Cloneable {
    Long getId();
    void setId(Long id);
}
