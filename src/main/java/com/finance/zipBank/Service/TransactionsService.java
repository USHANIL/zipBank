package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Models.Transactions;
import com.finance.zipBank.Repositories.AccountsRepo;
import com.finance.zipBank.Repositories.TransactionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionsService {

    @Autowired
    private TransactionsRepo transactionsRepo;

    @Autowired
    private AccountsRepo accountsRepo;

    //create transaction
    public Transactions create(Long accountNumber){
        Accounts accounts = accountsRepo.findById(accountNumber).get();

        Transactions transaction = new Transactions();
        transaction.setAccountNumber(accounts.getAccountNumber());
        transaction.setAmount(0L);
        transaction.setType("");

        return transactionsRepo.save(transaction);
    }

    //list all transactions for specific account
    public List<Transactions> list(Long accountNumber) {
//        Iterable<Transactions> listTransactions = transactionsRepo.findAll();
//        List<Transactions> transactionList = new ArrayList<>();
//        for (Transactions transactions : listTransactions){
//            if (transactions.getAccountNumber().equals(accountNumber)) {
//                transactionList.add(transactions);
//            }
//        }
        return transactionsRepo.findAllByAccountNumber(accountNumber);
    }

}
