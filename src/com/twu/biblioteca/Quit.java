package com.twu.biblioteca;

import java.util.ArrayList;

public class Quit implements MenuOperation {

    @Override
    public ArrayList<Book> execute(Library library, View view) {
        System.exit(0);
        return null;
    }
}
