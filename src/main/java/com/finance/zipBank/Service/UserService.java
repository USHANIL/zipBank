package com.finance.zipBank.Service;

import com.finance.zipBank.Models.User;
import com.finance.zipBank.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public User createUser(User user){
        return new User(user.getUsername(), user.getPassword(), user.getFirstName(),
                user.getLastName(), user.getEmail(), null);

    }

    public User findUserById(Long id){
        return userRepo.findById(id).get();
    }

}
