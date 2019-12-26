package com.finance.zipBank.Controllers;


import com.finance.zipBank.Models.Transactions;
import com.finance.zipBank.Service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;



    @PostMapping("/accounts/{accountNumber}/transaction_created")
    public ResponseEntity<Transactions> create(@PathVariable Long accountNumber, @RequestBody Transactions transactions) {
        return new ResponseEntity<>(transactionsService.create(accountNumber, transactions), HttpStatus.CREATED);
    }

    //list all transactions
    @GetMapping("/user/{id}/accounts/{accountNumber}/transactions")
    public ResponseEntity<Iterable<Transactions>> listAllTransactions(@PathVariable Long accountNumber) {
        return new ResponseEntity<>(transactionsService.list(accountNumber), HttpStatus.OK);
    }

}
