package com.twu.biblioteca.parser;

import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ChoiceView;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ListItemView;
import com.twu.biblioteca.view.ViewInterface;
import com.twu.biblioteca.menu.*;


public class Parser {

    private final Library bookLibrary;
    private final Library movieLibrary;
    private Login login;
    private ChoiceView choiceView;
    private ListItemView listItemView;

    public Parser(Library bookLibrary, Library movieLibrary, Login login, ChoiceView choiceView, ListItemView listItemView) {

        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.login = login;
        this.choiceView = choiceView;
        this.listItemView = listItemView;
    }

    public MenuOperation parseInput(String input, ViewInterface viewInterface) {
        SuccessfulView successfulView = new SuccessfulView();
        UnSuccessfulView unSuccessfulView = new UnSuccessfulView();
        if(input.equals("1"))
            return new ListItem(bookLibrary, viewInterface, successfulView);
        else if(input.equals("2"))
            return new ListItem(movieLibrary, viewInterface, successfulView);
        else if (input.equals("3"))
            return new CheckOut(bookLibrary, login, choiceView, successfulView, unSuccessfulView, "book", viewInterface);
        else if(input.equals("7"))
            return new Quit();
        else if(input.equals("4"))
            return new CheckIn(bookLibrary, login, choiceView, successfulView, unSuccessfulView, "book", viewInterface);
        else if(input.equals("5"))
            return new CheckOut(movieLibrary, login, choiceView, successfulView, unSuccessfulView, "movie", viewInterface);
        else if (input.equals("6"))
            return new CheckIn(movieLibrary, login, choiceView, successfulView, unSuccessfulView, "movie", viewInterface);
        else if (input.equals("8") && login.getCurrentUserRole().equals("admin"))
            return new ListCheckedOutItem(bookLibrary, listItemView, viewInterface);
        else if (input.equals("9") && login.getCurrentUserRole().equals("admin"))
            return new ListCheckedOutItem(movieLibrary, listItemView, viewInterface);
        else if (input.equals("0") && login.getCurrentUserRole().equals("user"))
            return new ListUserDetails(login.getCurrentUser(), viewInterface, successfulView);
        else if (input.equals("10"))
            return new Logout(login);
        else
        return new InvalidOption(viewInterface, unSuccessfulView);
    }
}
