package com.twu.biblioteca.parser;

import com.twu.biblioteca.User;
import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.view.View;

public class ListUserDetails implements MenuOperation {
    private User currentUser;

    public ListUserDetails(User currentUser) {

        this.currentUser = currentUser;
    }

    @Override
    public void execute(View view) {
        view.displayOutput(currentUser.toString());
    }
}
