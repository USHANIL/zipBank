package com.finance.zipBank.Service;


import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Models.Transactions;
import com.finance.zipBank.Repositories.AccountsRepo;

import com.finance.zipBank.Repositories.TransactionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TransactionsService {

    @Autowired
    private TransactionsRepo transactionsRepo;


    @Autowired
    private AccountsRepo accountsRepo;

    //create transaction
    public Transactions create(Long accountNumber, Transactions transactionData){
        Accounts accounts = accountsRepo.findById(accountNumber).get();

        Transactions transaction = new Transactions();
        transaction.setAccountNumber(accounts.getAccountNumber());
        transaction.setAmount(transactionData.getAmount());
        transaction.setType(transactionData.getType());
        transaction.setTransactionDate(new Date());

        return transactionsRepo.save(transaction);
    }

    //list all transactions for specific account
    public List<Transactions> list(Long accountNumber) {
        return transactionsRepo.findAllByAccountNumber(accountNumber);
    }

}
