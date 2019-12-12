package com.finance.zipBank.Repositories;


import com.finance.zipBank.Models.CheckingTransactions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckingTransactionRepo extends CrudRepository<CheckingTransactions, Long> {
}
