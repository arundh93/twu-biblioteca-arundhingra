package com.twu.biblioteca.test;

import com.twu.biblioteca.view.LoginView;
import com.twu.biblioteca.view.ViewInterface;
import com.twu.biblioteca.view.WelcomeView;

public class Controller {
    ViewInterface view;
    WelcomeView welcomeView;
    LoginView loginView;

    public Controller(WelcomeView welcomeView, LoginView loginView) {
        this.welcomeView = welcomeView;
        this.loginView = loginView;
    }
    public void run() {
        view = welcomeView.render(this);
        while (true) {
            if(view != null)
                view = view.render(this);
            else
                view = loginView.render(this);
        }
    }
}