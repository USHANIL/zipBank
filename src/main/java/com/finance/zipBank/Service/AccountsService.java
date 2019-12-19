package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Models.User;
import com.finance.zipBank.Repositories.AccountsRepo;
import com.finance.zipBank.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepo accountsRepo;

    @Autowired
    private UserRepo userRepo;

    //creates an account for a user by userId
    public Accounts createAccount(Long id){
        User user = userRepo.findById(id).get();

        Accounts newAccount = new Accounts();
        newAccount.setUserId(user.getUserId());
        newAccount.setBalance(0.0);
        newAccount.setType("Checking");

        return newAccount;
    }

}
