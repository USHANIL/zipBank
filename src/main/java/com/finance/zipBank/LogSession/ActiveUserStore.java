package com.finance.zipBank.LogSession;

import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

public class ActiveUserStore {

    public List<LoggedUser> users;

    public ActiveUserStore() {
        this.users = new ArrayList<>();
    }

    public List<LoggedUser> getUsers() {
        return users;
    }

    public void setUsers(List<LoggedUser> users) {
        this.users = users;
    }

    @Bean
    public ActiveUserStore activeUserStore(){
        return new ActiveUserStore();
    }
}
