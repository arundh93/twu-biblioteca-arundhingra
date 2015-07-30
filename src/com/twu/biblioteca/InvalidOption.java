package com.twu.biblioteca;

import java.util.ArrayList;

public class InvalidOption implements MenuOperation {

    @Override
    public ArrayList<Book> execute(Library library, View view) {
        view.displayOutput("Invalid input!");
        return new ArrayList<Book>();
    }
}
