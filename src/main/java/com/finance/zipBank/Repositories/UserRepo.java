package com.finance.zipBank.Repositories;

import com.finance.zipBank.Models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
    User findByUsername(String username);

}
