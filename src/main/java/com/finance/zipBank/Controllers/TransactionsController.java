package com.finance.zipBank.Controllers;

import com.finance.zipBank.Service.TransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionsController {

    @Autowired
    private TransactionsService transactionsService;
}
