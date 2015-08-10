package com.twu.biblioteca.parser;

import com.twu.biblioteca.menu.CheckOut;
import com.twu.biblioteca.menu.ListItem;
import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.menu.Quit;
import com.twu.biblioteca.menu.CheckIn;
import com.twu.biblioteca.menu.InvalidOption;
import com.twu.biblioteca.menu.ListCheckedOutItem;
import com.twu.biblioteca.menu.Logout;
import com.twu.biblioteca.menu.ListUserDetails;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ListItemView;
import com.twu.biblioteca.view.View;


public class Parser {

    private final Library bookLibrary;
    private final Library movieLibrary;
    private Login login;
    private View view;
    private ListItemView listItemView;

    public Parser(Library bookLibrary, Library movieLibrary, Login login, View view, ListItemView listItemView) {

        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.login = login;
        this.view = view;
        this.listItemView = listItemView;
    }

    public MenuOperation parseInput(String input) {
        if(input.equals("1"))
            return new ListItem(bookLibrary, view);
        else if(input.equals("2"))
            return new ListItem(movieLibrary, view);
        else if (input.equals("3"))
            return new CheckOut(bookLibrary, login, view, "book");
        else if(input.equals("7"))
            return new Quit();
        else if(input.equals("4"))
            return new CheckIn(bookLibrary, login, view, "book");
        else if(input.equals("5"))
            return new CheckOut(movieLibrary, login, view, "movie");
        else if (input.equals("6"))
            return new CheckIn(movieLibrary, login, view, "movie");
        else if (input.equals("8") && login.isCurrentUserAdmin())
            return new ListCheckedOutItem(bookLibrary, listItemView);
        else if (input.equals("9") && login.isCurrentUserAdmin())
            return new ListCheckedOutItem(movieLibrary, listItemView);
        else if (input.equals("0") && !login.isCurrentUserAdmin())
            return new ListUserDetails(login.getCurrentUser(), view);
        else if (input.equals("10"))
            return new Logout(login);
        else
        return new InvalidOption(view);
    }
}
