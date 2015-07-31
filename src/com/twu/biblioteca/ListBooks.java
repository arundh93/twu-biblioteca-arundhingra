package com.twu.biblioteca;

public class ListBooks implements MenuOperation{

    @Override
    public void execute(Library library, View view) {
        view.displayListOfBooks(library.getAvailableBooks());
    }
}
