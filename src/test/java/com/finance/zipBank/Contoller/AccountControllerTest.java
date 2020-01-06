package com.finance.zipBank.Contoller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.finance.zipBank.Controllers.AccountsController;
import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Repositories.AccountsRepo;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.junit.Test;

@RunWith(MockitoJUnitRunner.class)
    public class AccountControllerTest {

    private MockMvc mvc;

    @Mock
    private AccountsRepo accountsRepo;

    @InjectMocks
    private AccountsController accountsController;


    private JacksonTester<Accounts> jsonAccount;

}