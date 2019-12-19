package com.finance.zipBank.Service;

import com.finance.zipBank.Repositories.TransactionsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsService {

    @Autowired
    private TransactionsRepo transactionsRepo;
}
