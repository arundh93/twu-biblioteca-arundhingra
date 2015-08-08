package com.twu.biblioteca.view;

import com.twu.biblioteca.test.Controller;

public class WelcomeView implements ViewInterface{

    LoginView loginView;
    public WelcomeView(LoginView loginView) {
        this.loginView = loginView;
    }
    @Override
    public ViewInterface render(Controller controller) {
        System.out.println("===================================");
        System.out.println("****** Welcome to Biblioteca ******");
        System.out.println("===================================");
        return loginView;
    }

}
