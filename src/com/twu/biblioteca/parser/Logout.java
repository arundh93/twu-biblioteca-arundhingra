package com.twu.biblioteca.parser;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.view.View;

public class Logout implements MenuOperation {
    private Login login;

    public Logout(Login login) {

        this.login = login;
    }

    @Override
    public void execute(View view) {
        login.logOut();
    }
}
