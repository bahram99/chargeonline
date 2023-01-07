package com.fnap.ChargeOnline.Entity;

import com.fnap.ChargeOnline.base.Entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "t_ChargeRequestState")
public class ChargeRequestStateEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ChargeRequestStateGenerator")
    @SequenceGenerator(name = "ChargeRequestStateGenerator", sequenceName = "ChargeRequestState_SEQ", allocationSize = 1)
    @Column(name = "C_ID")
    private Long id;

    @Column(name = "c_language")
    private Integer language;

    @Column(name = "c_responseState")
    private Integer responseState;

    @Column(name = "c_responseDate")
    private Date responseDate;

    @Column(name = "c_requestState")
    private Integer requestState;

    @Column(name = "c_requestDate")
    private Date requestDate;

    @Column(name = "c_message")
    private String message;

    @Column(name = "c_content")
    private String content;

    @Column(name = "c_errorCode")
    private String errorCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_chargeRequest")
    private ChargeRequestEntity chargeRequest;
}
