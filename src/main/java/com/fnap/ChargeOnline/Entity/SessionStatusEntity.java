package com.fnap.ChargeOnline.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SessionStatusEntity {

    private String content;
    private String mobileNumber;
    private Integer lang;
    private String message;
    private Integer requestState;
    private Integer responseState;
    private Date timeStamp;
    private String traceCode;
    private Integer errorCode;
    private Double amount;
    private String mpaadCode;
    private String resultMessage;
    // for parsing of content
    private String userName;
    private Integer amountCode;
    private String chargeList;
    private Integer application;
    private ChargeProductEntity chargeProduct;
    private String referenceNumber;
    private Integer resultStatus;
}
