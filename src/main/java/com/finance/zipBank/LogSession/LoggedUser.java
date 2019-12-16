package com.finance.zipBank.LogSession;


import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import java.util.List;

@Component
public class LoggedUser  implements HttpSessionBindingListener {
    private String username;
    private String password;
    private ActiveUserStore activeUserStore;

    public LoggedUser (String username, String password, ActiveUserStore activeUserStore){
        this.username = username;
        this.password = password;
        this.activeUserStore = activeUserStore;
    }

    public LoggedUser(){}

    @Override
    public void valueBound(HttpSessionBindingEvent event){
        List<LoggedUser> users = activeUserStore.getUsers();
        LoggedUser user = (LoggedUser) event.getValue();


    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ActiveUserStore getActiveUserStore() {
        return activeUserStore;
    }

    public void setActiveUserStore(ActiveUserStore activeUserStore) {
        this.activeUserStore = activeUserStore;
    }
}
