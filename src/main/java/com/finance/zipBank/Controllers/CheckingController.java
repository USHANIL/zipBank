package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Checking;
import com.finance.zipBank.Models.Savings;
import com.finance.zipBank.Service.CheckingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CheckingController {

    @Autowired
    private CheckingService checkingService;

    //creating and getting checking/savings account

    @PostMapping("/create_checking")
    public ResponseEntity<Checking> createChecking(@RequestBody Checking checking){
        return new ResponseEntity<>(checkingService.createChecking(checking), HttpStatus.CREATED);

    }

    @GetMapping("/checking/{checking_Id}")
    public ResponseEntity<Checking> findCheckingById (@PathVariable Long checking_Id){
        return new ResponseEntity<>(checkingService.findCheckingById(checking_Id), HttpStatus.OK);
    }

    //deleting checking/saving accounts
    @DeleteMapping("/checking/delete{accountId}")
    public ResponseEntity<Boolean> deleteCheckingById(@PathVariable Long accountId){
        return new ResponseEntity<>(checkingService.deleteCheckingById(accountId), HttpStatus.OK);
    }

    //updating accounts
    @PutMapping("/checking/updated_checking/{accountId}")
    public ResponseEntity<Checking> updateCheckingAccount(@PathVariable Long accountId, @RequestBody Checking checking){
        return new ResponseEntity<>(checkingService.updateCheckingAccount(accountId, checking), HttpStatus.OK);
    }
    @GetMapping("/test")
    public String testMe(){
        return "it defenietly Works";
    }


}
