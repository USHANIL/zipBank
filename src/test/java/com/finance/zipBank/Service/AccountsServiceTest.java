package com.finance.zipBank.Service;

import com.finance.zipBank.Models.Accounts;
import com.finance.zipBank.Repositories.AccountsRepo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountsServiceTest {
    @Mock
    private AccountsRepo accountsRepo;

    @InjectMocks
    private AccountsService accountsService;

    @Test
    public void getAllAccountsTest(){

        when(accountsService.getAllAccounts()).thenReturn(stubAccountEntities());

        accountsService.getAllAccounts();

        verify(accountsRepo,times(1)).findAll();


    }
    private List<Accounts>stubAccountEntities(){
        Accounts account1 = new Accounts(1L,1000.00,"Checking");
        Accounts account2 = new Accounts(2L, 2000.00, "Savings");
        Accounts account3 = new Accounts(3L, 3000.00, "Checking");
        return Arrays.asList(account1, account2, account3);

    }
    @Test
    public void createAccountTest() {
        Accounts expected = new Accounts(5L, 1250.00, "Checking");
        doReturn(expected).when(accountsRepo).save(any(Accounts.class));
        Accounts actual = accountsService.createAccount2(stubAddNewAccountRequest());
        Assert.assertEquals(expected.toString(), actual.toString());
    }


    @Test
    public void CreateAccountWithNoReturnTest() {
        Accounts expected = new Accounts(5L, 1250.00, "Checking");
        doReturn(expected).when(accountsRepo).save(any(Accounts.class));
        accountsService.createAccount2(stubAddNewAccountRequest());
        ArgumentCaptor<Accounts> captor = ArgumentCaptor.forClass(Accounts.class);
        verify(accountsRepo, times(1)).save(captor.capture());
        Assert.assertEquals(expected.toString(), captor.getValue().toString());
    }

    private Accounts stubAddNewAccountRequest() {
        Accounts addNewAccountRequest = new Accounts();
        addNewAccountRequest.setUserId(5L);
        addNewAccountRequest.setBalance(1250.00);
        addNewAccountRequest.setType("Checking");
        return addNewAccountRequest;
    }
}




