package com.twu.biblioteca.view;

public class WelcomeView implements ViewInterface{

    LoginView loginView;
    public WelcomeView(LoginView loginView) {
        this.loginView = loginView;
    }
    @Override
    public ViewInterface render(ViewInterface viewInterface) {
        System.out.println("===================================");
        System.out.println("****** Welcome to Biblioteca ******");
        System.out.println("===================================");
        return loginView;
    }

}
