package com.twu.biblioteca.model;

import java.util.ArrayList;


public class Login {


    private ArrayList<User> userList;
    private User currentUser;
    private boolean userLogged;

    public Login(ArrayList<User> userList) {
        this.userList = userList;
        userLogged = false;
    }

    private String getCurrentUserRole() {
        return currentUser.getRole();
    }

    public boolean isCurrentUserAdmin() {
        return getCurrentUserRole().equals("admin");
    }

    public String getCurrentUserName() {
        return currentUser.getName();
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public boolean isUserLogged() {
        return userLogged;
    }

    public void logOut() {
        userLogged = false;
    }


    public boolean setCurrentUser(String userName, String password) {
        boolean state = false;
        for (User user : userList) {
            if (user.verify(userName, password)) {
                this.currentUser = user;
                userLogged = true;
                state = true;
                break;
            } else
                state = false;
        }
        return state;
    }
}
