package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionsRepo extends CrudRepository<Transactions, Long> {
}
