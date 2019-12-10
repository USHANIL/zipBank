package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.Login_Credentials;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Login_Credentials_Repo extends CrudRepository<Long, Login_Credentials> {
}
