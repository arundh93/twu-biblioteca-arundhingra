package com.twu.biblioteca.menu;

import com.twu.biblioteca.test.User;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.ViewInterface;


public class ListUserDetails implements MenuOperation {
    private User currentUser;
    private SuccessfulView successfulView;

    public  ListUserDetails(User currentUser, SuccessfulView successfulView) {

        this.currentUser = currentUser;
        this.successfulView = successfulView;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        successfulView.printUserDetails(currentUser);
        return viewInterface;
    }
}
