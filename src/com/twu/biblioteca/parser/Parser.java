package com.twu.biblioteca.parser;

import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ChoiceView;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ListItemView;
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

    public MenuOperation parseInput(String input) {
        SuccessfulView successfulView = new SuccessfulView();
        UnSuccessfulView unSuccessfulView = new UnSuccessfulView();
        if(input.equals("1"))
            return new ListItem(bookLibrary, successfulView);
        else if(input.equals("2"))
            return new ListItem(movieLibrary, successfulView);
        else if (input.equals("3"))
            return new CheckOut(bookLibrary, login, choiceView, successfulView, unSuccessfulView, "book");
        else if(input.equals("7"))
            return new Quit();
        else if(input.equals("4"))
            return new CheckIn(bookLibrary, login, choiceView, successfulView, unSuccessfulView, "book");
        else if(input.equals("5"))
            return new CheckOut(movieLibrary, login, choiceView, successfulView, unSuccessfulView, "movie");
        else if (input.equals("6"))
            return new CheckIn(movieLibrary, login, choiceView, successfulView, unSuccessfulView, "movie");
        else if (input.equals("8") && login.isCurrentUserAdmin())
            return new ListCheckedOutItem(bookLibrary, listItemView);
        else if (input.equals("9") && login.isCurrentUserAdmin())
            return new ListCheckedOutItem(movieLibrary, listItemView);
        else if (input.equals("0") && !login.isCurrentUserAdmin())
            return new ListUserDetails(login.getCurrentUser(), successfulView);
        else if (input.equals("10"))
            return new Logout(login);
        else
        return new InvalidOption(unSuccessfulView);
    }
}
