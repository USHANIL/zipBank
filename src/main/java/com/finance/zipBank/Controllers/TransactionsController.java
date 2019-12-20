package com.finance.zipBank.Controllers;


import com.finance.zipBank.Models.Transactions;
import com.finance.zipBank.Service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;

    @PostMapping("user/{id}/accounts/{id}")
    public ResponseEntity<Transactions> create(@PathVariable Long id){
        return new ResponseEntity<>(transactionsService.create(id), HttpStatus.CREATED);
    }

    //list all transactions
    @GetMapping("/accounts/{accountNumber}")
    public  ResponseEntity<Iterable<Transactions>> listAllTransactions(@PathVariable Long accountNumber){
        return new ResponseEntity<>(transactionsService.list(accountNumber), HttpStatus.OK);
    }

}
