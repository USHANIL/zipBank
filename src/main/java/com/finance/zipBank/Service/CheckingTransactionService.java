package com.finance.zipBank.Service;

import com.finance.zipBank.Controllers.CheckingTransactionController;
import com.finance.zipBank.Models.CheckingTransactions;
import com.finance.zipBank.Repositories.CheckingTransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CheckingTransactionService extends CheckingTransactionController {
    @Autowired
    private CheckingTransactionRepo checkingTransactionRepo;


    public Iterable<CheckingTransactions> getCheckingTransactionByAccountId(Long id){
        return null;
    }

    public Iterable<CheckingTransactions> getCheckingTransactionByType(Long id, String type){
        return null;
    }

    public Iterable<CheckingTransactions> getCheckingTransactionByDate(Long id, Date date){
        return null;
    }



}
