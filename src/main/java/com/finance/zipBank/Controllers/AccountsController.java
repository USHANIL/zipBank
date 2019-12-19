package com.finance.zipBank.Controllers;

import com.finance.zipBank.Service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    private AccountsService accountsService;


}
