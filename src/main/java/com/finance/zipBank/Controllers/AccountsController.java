package com.finance.zipBank.Controllers;

import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Models.Transactions;
import com.finance.zipBank.Service.AccountsService;
import com.finance.zipBank.Service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(maxAge = 3600)
public class AccountsController {

    @Autowired
    private AccountsService accountsService;

    @Autowired
    private TransactionsService transactionsService;

    @PostMapping("API/user/{userId}/account_created")
    public ResponseEntity<Accounts> createAccount(@PathVariable Long userId) {
        return new ResponseEntity<>(accountsService.createAccount(userId), HttpStatus.CREATED);
    }

    @PostMapping("API/accounts/dummy_created")
    public ResponseEntity<Accounts>createDummy(@RequestBody Accounts account){
        return new ResponseEntity<>(accountsService.createDummyAccount(account), HttpStatus.CREATED);
    }
    @PutMapping("API/accounts/{accountId}")
    public ResponseEntity<Accounts> updateAccount(@RequestBody Accounts account, @PathVariable Long accountId) {
        return new ResponseEntity<>(accountsService.updateAccount(account, accountId), HttpStatus.OK);
    }
    @GetMapping("API/user/{userId}/accounts")
    public ResponseEntity<List<Accounts>> getAllAccountsByUserId(@PathVariable Long userId) {
        return new ResponseEntity<>(accountsService.getAllAccountsByUserId(userId), HttpStatus.OK);
    }
    @GetMapping("API/accounts/{accountId}")
    public ResponseEntity<Accounts> getAccountById(@PathVariable Long accountId) {
        return new ResponseEntity<Accounts>(accountsService.getAccountById(accountId), HttpStatus.OK);
    }
    @GetMapping("API/accounts/list5/{userId}")
    public ResponseEntity<List<Accounts>> getFirstFiveAccounts(@PathVariable Long userId){
        return new ResponseEntity<>(accountsService.getFirstFiveAcctsById(userId),HttpStatus.OK);
    }
    @GetMapping("API/accounts/all_accounts")
    public ResponseEntity<Iterable<Accounts>>getAllAccounts(){
        return new ResponseEntity<>(accountsService.getAllAccounts(),HttpStatus.OK);
    }
    @DeleteMapping("API/accounts/{accountId}")
    public ResponseEntity<Accounts> deleteAccount(@PathVariable Long accountId) {
        accountsService.deleteAccountById(accountId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("API/accounts/deposit/")
    public  ResponseEntity<Accounts>accountDeposit(@RequestBody Transactions transaction){
       return new ResponseEntity<Accounts>(accountsService.accountDeposit(transaction), HttpStatus.OK);
    }
    @PutMapping("API/accounts/withdraw/")
    public  ResponseEntity<Accounts>accountWithdraw(@RequestBody Transactions transaction){
        return new ResponseEntity<>(accountsService.accountWithdraw(transaction),HttpStatus.OK);
    }
    @PutMapping("API/accounts/transferRecipient/")
    public ResponseEntity<Accounts>transferRecipient(@RequestBody Transactions transaction) {
        return new ResponseEntity<>(accountsService.transferRecipient(transaction), HttpStatus.OK);
    }
    @PutMapping("API/accounts/transferSender/")
    public ResponseEntity<Accounts>transferSender(@RequestBody Transactions transaction) {
        return new ResponseEntity<>(accountsService.transferSender(transaction), HttpStatus.OK);
    }
}
