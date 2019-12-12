package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Checking;
import com.finance.zipBank.Models.CheckingTransactions;
import com.finance.zipBank.Service.CheckingService;
import com.finance.zipBank.Service.CheckingTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckingTransactionController {

    @Autowired
    private CheckingTransactionService checkingTransactionService;


    @Autowired
    private CheckingService checkingService;

    @PostMapping("/deposittochecking")
    public ResponseEntity<Checking> checkingDeposit(@RequestBody CheckingTransactions chkTransaction){
        return null;
    }
    @PostMapping("/withdrawfromchecking")
    public ResponseEntity<Checking> checkingWithdraw(@RequestBody CheckingTransactions chkTransaction){
        return null;
    }

    @PostMapping("/transferfromchecking")
    public ResponseEntity<Checking> savingsTransfer(@RequestBody CheckingTransactions chkTransaction){
        return null;
    }




}
