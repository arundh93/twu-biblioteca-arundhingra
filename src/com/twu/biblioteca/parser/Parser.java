package com.twu.biblioteca.parser;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.menu.*;
import com.twu.biblioteca.model.Library;

public class Parser {


    private final Library bookLibrary;
    private final Library movieLibrary;
    private Login login;

    public Parser(Library bookLibrary, Library movieLibrary, Login login) {

        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.login = login;
    }

    public MenuOperation parseInput(String input) {
        if(input.equals("1"))
            return new ListBooks(bookLibrary);
        else if(input.equals("2"))
            return new ListMovies(movieLibrary);
        else if (input.equals("3"))
            return new CheckOut(bookLibrary, login);
        else if(input.equals("7"))
            return new Quit();
        else if(input.equals("4"))
            return new CheckIn(bookLibrary, login);
        else if(input.equals("5"))
            return new CheckOut(movieLibrary, login);
        else if (input.equals("6"))
            return new CheckIn(movieLibrary, login);
        else if (input.equals("8") && login.getCurrentUserRole().equals("admin"))
            return new ListCheckedOutItem(bookLibrary);
        else if (input.equals("9") && login.getCurrentUserRole().equals("admin"))
            return new ListCheckedOutItem(movieLibrary);
        else if (input.equals("0") && login.getCurrentUserRole().equals("user"))
            return new ListUserDetails(login.getCurrentUser());
        else if (input.equals("10"))
            return new Logout(login);
        else
        return new InvalidOption();

    }
}
