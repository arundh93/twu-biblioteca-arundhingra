package com.twu.biblioteca;

import java.util.ArrayList;


public class ListBooks implements MenuOperation{

    @Override
    public ArrayList<Book> execute(Library library) {
        return library.getBooks();
    }
}
