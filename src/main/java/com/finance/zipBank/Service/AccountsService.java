package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Models.User;
import com.finance.zipBank.Repositories.AccountsRepo;
import com.finance.zipBank.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepo accountsRepo;

    @Autowired
    private UserRepo userRepo;

    public Accounts createDummyAccount(Accounts account) {
        Accounts newAccount = new Accounts();
        newAccount.setUserId(1L);
        newAccount.setBalance(account.getBalance());
        newAccount.setType(account.getType());
        return accountsRepo.save(newAccount);
    }

    public Accounts createAccount(Long id) {
        User user = userRepo.findById(id).get();
        Accounts newAccount = new Accounts();
        newAccount.setUserId(user.getUserId());
        newAccount.setBalance(0.0);
        newAccount.setType("Checking");
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
        temp.setUserId(account.getUserId());
        temp.setAccountNumber(account.getAccountNumber());
        temp.setTransactionsList(account.getTransactionsList());
        return accountsRepo.save(temp);
    }

    public Accounts accountDeposit(Accounts account, Double amount) {
        Double balance = account.getBalance();
        balance += amount;
        account.setBalance(balance);
        return accountsRepo.save(account);
    }

    public Accounts accountWithdrawl(Accounts account, Double amount) {
        Double balance = account.getBalance();
        balance -= amount;
        account.setBalance(balance);
        return accountsRepo.save(account);
    }

    public Boolean deleteAccountById(Long accountId) {
        accountsRepo.deleteById(accountId);
        return true;
    }


}
