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
        transaction.setUserId(accounts.getUserId());
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

    public  List<Transactions> listTop5ByDate(Long accountNumber){
        return transactionsRepo.findTop5ByAccountNumberOrderByTransactionDate(accountNumber);
    }

    public List<Transactions> listTop5ForUser(Long userId){
        return transactionsRepo.findTop5ByUserIdOrderByTransactionDate(userId);
    }

    public List<Transactions> listTransactionDetails(Long transactionId){
        return transactionsRepo.findByTransactionId(transactionId);
    }

}
