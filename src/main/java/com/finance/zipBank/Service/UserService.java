package com.finance.zipBank.Service;

import com.finance.zipBank.Models.User;
import com.finance.zipBank.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    //finds user by ID
    public User findUserById(Long id){
        return userRepo.findById(id).get();

    }
    //creates user
    public User createUser(User user){
        User newUser = new User();
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setEmail(user.getEmail());

        return userRepo.save(newUser);
    }

    //updates the user
    public User updateUser(Long id,User user){
        User updateUser = findUserById(id);
        updateUser.setUsername(user.getUsername());
        updateUser.setPassword(user.getPassword());
        updateUser.setEmail(user.getEmail());

        return userRepo.save(updateUser);
    }




}
