package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @PostMapping("/user/{id}/account_created")
    public ResponseEntity<Accounts> createAccount(@PathVariable Long id){
        return new ResponseEntity<>(accountsService.createAccount(id), HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}/accounts")
    public ResponseEntity<List<Accounts>> getAllAccountsByUserId (@PathVariable Long id){
        return new ResponseEntity<>(accountsService.getAllAccountsByUserId(id), HttpStatus.OK);
    }


}
