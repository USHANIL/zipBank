package com.finance.zipBank.Service;

import com.finance.zipBank.Models.SavingsTransaction;
import com.finance.zipBank.Repositories.SavingsTransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SavingsTransactionService{

    @Autowired
    private SavingsTransactionRepo savingsTransactionRepo;


    public Iterable<SavingsTransaction> getSavingsTransactionByAccountId(Long id){
        return null;
    }

    public Iterable<SavingsTransaction> getSavingsTransactionByType(Long id, String type){
        return null;
    }

    public Iterable<SavingsTransaction> getSavingsTransactionByDate(Long id, Date date){
        return null;
    }
}
