package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Login_Account;
import com.finance.zipBank.Service.AccountHolderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountHolderController {

    @Autowired
    private AccountHolderService accountHolderService;

    ////creating account requests
    @PostMapping("/create_login_account")
    public ResponseEntity<Login_Account> createAccount(@RequestBody Login_Account login){
        return new ResponseEntity<>(accountHolderService.createAccount(login), HttpStatus.CREATED);
    }


    //find account
    @GetMapping("/login_account/{account}")
    public ResponseEntity<Login_Account> getAccount(@PathVariable Long account){
        return new ResponseEntity<>(accountHolderService.findAccountById(account), HttpStatus.OK);
    }

    //updating login account/user information

    @PutMapping("/login_account/update/{account}")
    public ResponseEntity<Login_Account> updateAccount(@PathVariable Long account, @RequestBody Login_Account login){
        return new ResponseEntity<>(accountHolderService.updateAccount(account,login), HttpStatus.OK);
    }






}
