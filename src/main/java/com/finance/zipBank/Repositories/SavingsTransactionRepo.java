package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.SavingsTransaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SavingsTransactionRepo extends CrudRepository<SavingsTransaction, Long> {
}
