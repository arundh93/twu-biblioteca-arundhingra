package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.User;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;


public class ListUserDetails implements MenuOperation {
    private User currentUser;
    private View view;

    public  ListUserDetails(User currentUser, View view) {

        this.currentUser = currentUser;
        this.view = view;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        view.printUserDetails(currentUser);
        return viewInterface;
    }
}
