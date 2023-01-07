package com.fnap.ChargeOnline.dataaccess.cardtransaction;

import com.fnap.ChargeOnline.Entity.ChargeTransactionEntity;
import com.fnap.ChargeOnline.base.enumeration.ActiveInactiveEnum;

import java.util.List;

public interface ChargeTransactionRepository extends CardTransactionRepository<ChargeTransactionEntity> {

    List<ChargeTransactionEntity> findByIsSentAndActiveAndVerificationDateIsNotNull(Boolean issent, ActiveInactiveEnum item);

    long countByIsSentAndActiveAndVerificationDateIsNotNull(Boolean issent, ActiveInactiveEnum item);
}
