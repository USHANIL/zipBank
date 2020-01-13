package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Models.Transactions;
import com.finance.zipBank.Models.User;
import com.finance.zipBank.Repositories.AccountsRepo;
import com.finance.zipBank.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepo accountsRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private TransactionsService transactionsService;



    public Accounts createAccount(Long id) {
        User user = userRepo.findById(id).get();
        Accounts newAccount = new Accounts();
        newAccount.setUserId(user.getUserId());
        newAccount.setBalance(0.0);
        newAccount.setType("Checking");
        return accountsRepo.save(newAccount);
    }

    public Accounts createAccount2(Accounts account) {
        Accounts newAccount = new Accounts();
        newAccount.setUserId(account.getUserId());
        newAccount.setAccountName(account.getAccountName());
        newAccount.setBalance(account.getBalance());
        newAccount.setType(account.getType());
        return accountsRepo.save(newAccount);
    }

    public List<Accounts> getAllAccountsByUserId(Long id) {
        return accountsRepo.findAllByUserId(id);
    }

    public Iterable<Accounts> getAllAccounts() {
        return accountsRepo.findAll();
    }

    public Accounts getAccountById(Long id) {
        return accountsRepo.findById(id).get();
    }

    public List<Accounts> getFirstFiveAcctsById(Long userId) {
        return accountsRepo.findTop5ByUserId(userId);
    }

    public Accounts updateAccount(Accounts account, Long accountId) {
        Accounts temp = getAccountById(accountId);
        temp.setBalance(account.getBalance());
        temp.setType(account.getType());
        temp.setAccountName(account.getAccountName());
        temp.setUserId(account.getUserId());
        temp.setAccountNumber(account.getAccountNumber());
        temp.setTransactionsList(account.getTransactionsList());
        return accountsRepo.save(temp);
    }

    public Accounts accountDeposit(Transactions transactions) {
        Long accountId = transactions.getAccountNumber();
        Double amount = transactions.getAmount();
        Accounts account = getAccountById(accountId);
        if(transactions.getAmount() <= 0){
            throw new IllegalArgumentException();
        }

        Double balance = account.getBalance();
        balance += amount;
        account.setBalance(balance);
        Transactions transactions2 = new Transactions(account.getAccountNumber(), amount,"Deposit", new Date());
        transactionsService.create(accountId, transactions2);
        return accountsRepo.save(account);
    }

    public Accounts transferRecipient(Transactions transactions) {
        Long accountId = transactions.getAccountNumber();
        Double amount = transactions.getAmount();
        Accounts account = getAccountById(accountId);
        if (transactions.getAmount() <= 0) {
            throw new IllegalArgumentException();
        }

        Double balance = account.getBalance();
        balance += amount;
        account.setBalance(balance);
        Transactions transactions2 = new Transactions(account.getAccountNumber(), amount, "Transfer received ", new Date());
        transactionsService.create(accountId, transactions2);
        return accountsRepo.save(account);
    }
    public Accounts transferSender(Transactions transactions) {
        Long accountId = transactions.getAccountNumber();
        Double amount = transactions.getAmount();
        Accounts account = getAccountById(accountId);
        if(amount <= 0 || amount > account.getBalance() ) {
            throw new IllegalArgumentException();
        }
        Double balance = account.getBalance();
        balance -= amount;
        account.setBalance(balance);
        Transactions transactions2 = new Transactions(account.getAccountNumber(), amount*-1,"Transfer sent ", new Date());
        transactionsService.create(accountId, transactions2);
        return accountsRepo.save(account);
    }

    public Accounts accountWithdraw(Transactions transactions) {
        Long accountId = transactions.getAccountNumber();
        Double amount = transactions.getAmount();
        Accounts account = getAccountById(accountId);
        if(amount <= 0 || amount > account.getBalance() ) {
            throw new IllegalArgumentException();
        }
        Double balance = account.getBalance();
        balance -= amount;
        account.setBalance(balance);
        Transactions transactions2 = new Transactions(account.getAccountNumber(), amount*-1,"Withdraw", new Date());
        transactionsService.create(accountId, transactions2);
        return accountsRepo.save(account);
    }


    public Boolean deleteAccountById(Long accountId) {
        accountsRepo.deleteById(accountId);
        return true;
    }


}
