package com.twu.biblioteca.menu;

import com.twu.biblioteca.test.User;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.ViewInterface;


public class ListUserDetails implements MenuOperation {
    private User currentUser;
    private ViewInterface viewInterface;
    private SuccessfulView successfulView;

    public  ListUserDetails(User currentUser, ViewInterface viewInterface, SuccessfulView successfulView) {

        this.currentUser = currentUser;
        this.viewInterface = viewInterface;
        this.successfulView = successfulView;
    }

    @Override
    public ViewInterface execute() {
        successfulView.printUserDetails(currentUser);
        return viewInterface;
    }
}
