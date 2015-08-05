package com.twu.biblioteca.model;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.menu.MenuOperation;


public class BibliotecaController {

    private View view;
    private Library bookLibrary;
    private Library movieLibrary;
    private Parser parser;
    private Login login;

    public BibliotecaController(View view, Library bookLibrary, Library movieLibrary, Parser parser, Login login) {
        this.view = view;
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.parser = parser;
        this.login = login;
    }

    public void start(boolean shouldntExit) {
        view.displayWelcomeMessage();
        String[] credentials;
        boolean isAdmin = false;
        while (shouldntExit) {
            credentials = view.askCredentials();
            if (login.setCurrentUser(credentials[0], credentials[1])) {
                if (login.getCurrentUserRole().equals("admin")) {
                    getInput(true, login);
                } else
                    getInput(false, login);
            }
        }
    }

    private void getInput(boolean isAdmin, Login login) {
        while (login.isUserLogged()) {
            if (isAdmin) {
                view.displayAdminMenu();
                String input = view.takeInput();
                MenuOperation menuOperation;
                menuOperation = parser.parseInput(input);
                menuOperation.execute(view);
            } else {
                view.displayMenu();
                String input = view.takeInput();
                MenuOperation menuOperation;
                menuOperation = parser.parseInput(input);
                menuOperation.execute(view);
            }
        }
    }
}
