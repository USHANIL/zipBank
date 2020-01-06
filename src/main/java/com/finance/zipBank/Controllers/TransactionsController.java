package com.finance.zipBank.Controllers;


import com.finance.zipBank.Models.Transactions;
import com.finance.zipBank.Service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


@RestController
@CrossOrigin(maxAge = 3600)
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @PostMapping("/API/accounts/{accountNumber}/transaction_created")

    public ResponseEntity<Transactions> create(@PathVariable Long accountNumber, @RequestBody Transactions transactions) {
        return new ResponseEntity<>(transactionsService.create(accountNumber, transactions), HttpStatus.CREATED);
    }
    @GetMapping("/API/accounts/{accountNumber}/transactions")
    public ResponseEntity<Iterable<Transactions>> listAllTransactionsByAccount(@PathVariable Long accountNumber) {
        return new ResponseEntity<>(transactionsService.list(accountNumber), HttpStatus.OK);
    }

    @GetMapping("/accounts/{accountNumber}/top_5_transactions")
    public ResponseEntity<Iterable<Transactions>> listTop5TransactionsByDate(@PathVariable Long accountNumber){
        return new ResponseEntity<>(transactionsService.listTop5ByDate(accountNumber), HttpStatus.OK);
    }

    @GetMapping("/API/user/{userId}/most_recent_transactions")
    public ResponseEntity<Iterable<Transactions>> listTop5TransactionsForUser(@PathVariable Long userId){
        return new ResponseEntity<>(transactionsService.listTop5ForUser(userId), HttpStatus.OK);
    }

    @GetMapping("API/accounts/transactions/{transactionId}/transaction_details")
    public ResponseEntity<Iterable<Transactions>> listTransactionDetails(@PathVariable Long transactionId){
        return new ResponseEntity<>(transactionsService.listTransactionDetails(transactionId), HttpStatus.OK);
    }
}
