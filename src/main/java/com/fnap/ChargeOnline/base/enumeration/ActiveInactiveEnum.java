package com.fnap.ChargeOnline.base.enumeration;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ActiveInactiveEnum {

    DEACTIVE(0L, "DEACTIVE"),
    ACTIVE(1L, "ACTIVE");
    String value;
    Long ordinal;

    ActiveInactiveEnum(Long ordinal, String value) {
        this.ordinal = ordinal;
        this.value = value;
    }
    public String getValue() {
        return value;
    }

    public Long getOrdinal() {
        return ordinal;
    }

}
