package com.finance.zipBank.Service;

import com.finance.zipBank.Repositories.AccountsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountsService {

    @Autowired
    private AccountsRepo accountsRepo;
}
