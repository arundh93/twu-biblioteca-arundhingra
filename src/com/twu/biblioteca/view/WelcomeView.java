package com.twu.biblioteca.view;

public class WelcomeView implements ViewInterface{

    LoginView loginView;
    private View view;

    public WelcomeView(LoginView loginView, View view) {
        this.loginView = loginView;
        this.view = view;
    }
    @Override
    public ViewInterface render(ViewInterface viewInterface) {
        view.displayOutput("===================================");
        view.displayOutput("****** Welcome to Biblioteca ******");
        view.displayOutput("===================================");
        return loginView;
    }
}
