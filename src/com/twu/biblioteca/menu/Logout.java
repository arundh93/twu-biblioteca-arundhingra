package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ViewInterface;


public class Logout implements MenuOperation {

    private Login login;

    public Logout(Login login) {

        this.login = login;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        login.logOut();
        return null;
    }
}
