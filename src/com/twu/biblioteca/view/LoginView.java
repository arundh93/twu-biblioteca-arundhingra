package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.model.User;


public class LoginView implements ViewInterface {
    private Login login;
    private final UserView userView;
    private final AdminView adminView;
    private User user;
    private View view;

    public LoginView(View view, Login login, UserView userView, AdminView adminView) {
        this.view = view;
        this.login = login;
        this.userView = userView;
        this.adminView = adminView;
    }

    @Override
    public ViewInterface render(ViewInterface viewInterface) {
        String username, password;
        do {
            while(!view.initialMenu());
            System.out.println("Enter the user name");
            username = view.takeInput();
            System.out.println("Enter the password");
            password = view.takeInput();
        }
        while (!login.setCurrentUser(username, password));
        if(login.isCurrentUserAdmin())
            return adminView;
        else
            return userView;
    }
}
