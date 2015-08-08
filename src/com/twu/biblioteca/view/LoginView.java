package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.test.User;


public class LoginView implements ViewInterface {
    private Login login;
    private final UserView userView;
    private final AdminView adminView;
    private InitialView initialView;
    private User user;
    private View view;

    public LoginView(View view, Login login, UserView userView, AdminView adminView, InitialView initialView) {
        this.view = view;
        this.login = login;
        this.userView = userView;
        this.adminView = adminView;
        this.initialView = initialView;
    }

    @Override
    public ViewInterface render(ViewInterface viewInterface) {
        String username, password;
        do {
            while(!initialView.render());
            System.out.println("Enter the user name");
            username = view.takeInput();
            System.out.println("Enter the password");
            password = view.takeInput();
        }
        while (!login.setCurrentUser(username, password));
        user = login.getCurrentUser();
        if(user.getRole().equals("admin"))
            return adminView;
        else
            return userView;
    }
}
