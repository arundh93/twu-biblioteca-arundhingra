package com.twu.biblioteca.view;

import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.test.Controller;
import com.twu.biblioteca.test.User;
import java.util.Scanner;


public class LoginView implements ViewInterface {
    private Scanner scanner;
    private Login login;
    private final UserView userView;
    private final AdminView adminView;
    private InitialView initialView;
    private User user;

    public LoginView(Scanner scanner, Login login, UserView userView, AdminView adminView, InitialView initialView) {
        this.scanner = scanner;
        this.login = login;
        this.userView = userView;
        this.adminView = adminView;
        this.initialView = initialView;
    }

    @Override
    public ViewInterface render(Controller controller) {
        String username, password;
        do {
            while(!initialView.render());
            System.out.println("Enter the user name");
            username = scanner.nextLine();
            System.out.println("Enter the password");
            password = scanner.nextLine();
        }
        while (!login.setCurrentUser(username, password));
        user = login.getCurrentUser();
        if(user.getRole().equals("admin"))
            return adminView;
        else
            return userView;
    }
}
