package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Transactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionsRepo extends CrudRepository<Transactions, Long> {
    List<Transactions> findAllByAccountNumber (Long accountNumber);
}
