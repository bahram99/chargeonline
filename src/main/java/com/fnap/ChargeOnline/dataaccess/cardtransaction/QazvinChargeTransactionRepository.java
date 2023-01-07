package com.fnap.ChargeOnline.dataaccess.cardtransaction;

import com.fnap.ChargeOnline.Entity.QazvinChargeTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QazvinChargeTransactionRepository extends JpaRepository<QazvinChargeTransactionEntity,Long> {
}
