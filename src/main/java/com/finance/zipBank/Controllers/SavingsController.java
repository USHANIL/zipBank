package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Savings;
import com.finance.zipBank.Service.SavingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public class SavingsController {
    @Autowired
    private SavingsService savingsService;

    //creating and getting checking/savings account


    @PostMapping("/create_savings")
    public ResponseEntity<Savings> createSavings(@RequestBody Savings savings){
        return new ResponseEntity<>(savingsService.createSavings(savings), HttpStatus.CREATED);
    }

    @GetMapping("/savings/{savings_Id}")
    public ResponseEntity<Savings> findSavingsById (@PathVariable Long savings_Id){
        return new ResponseEntity<>(savingsService.findSavingsById(savings_Id), HttpStatus.OK);
    }

    @DeleteMapping("/savings/delete{accountId}")
    public ResponseEntity<Boolean> deletesSavingsById(@PathVariable Long accountId){
        return new ResponseEntity<>(savingsService.deleteSavingsById(accountId), HttpStatus.OK);
    }

    @PutMapping("/savings/updated_savings/{accountId}")
    public ResponseEntity<Savings> updateSavingsAccount(@PathVariable Long accountId, @RequestBody Double savings){
        return new ResponseEntity<Savings>(savingsService.updateSavingsAccount(accountId, savings), HttpStatus.OK);
    }

}
