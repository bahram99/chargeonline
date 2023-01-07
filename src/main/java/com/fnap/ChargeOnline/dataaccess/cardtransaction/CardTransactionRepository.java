package com.fnap.ChargeOnline.dataaccess.cardtransaction;

import com.fnap.ChargeOnline.Entity.CardTransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardTransactionRepository<T extends CardTransactionEntity> extends JpaRepository<CardTransactionEntity,Long> {

}
