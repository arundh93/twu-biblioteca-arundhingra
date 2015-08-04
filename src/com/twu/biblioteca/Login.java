package com.twu.biblioteca;

import java.util.ArrayList;

public class Login {

    private ArrayList<User> userList;
    private User currentUser;

    public Login(ArrayList<User> userList) {
        this.userList = userList;
    }

    public boolean setCurrentUser(String userName, String password) {
        for(User user : userList) {
            if(user.verify(userName, password))
                this.currentUser = user;
                return true;
        }
        return false;
    }
}
