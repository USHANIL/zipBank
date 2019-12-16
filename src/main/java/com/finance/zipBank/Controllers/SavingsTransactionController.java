package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Savings;
import com.finance.zipBank.Models.SavingsTransaction;
import com.finance.zipBank.Service.SavingsService;
import com.finance.zipBank.Service.SavingsTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SavingsTransactionController {
    @Autowired
    private SavingsTransactionService savingsTransactionService;

    @Autowired
    private SavingsService savingsService;

    @PostMapping("/deposittosavings")
    public ResponseEntity<Savings> savingsDeposit(@RequestBody SavingsTransaction svngTransaction){
        return null;
    }
    @PostMapping("/withdrawfromsavings")
    public ResponseEntity<Savings> savingsWithdraw(@RequestBody SavingsTransaction svngTransaction){
        return null;
    }

    @PostMapping("/transferfromsavings")
    public ResponseEntity<Savings> savingsTransfer(@RequestBody SavingsTransaction svngTransaction){
        return null;
    }
}
