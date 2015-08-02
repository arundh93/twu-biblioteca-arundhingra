package com.twu.biblioteca;

public class    ListBooks implements MenuOperation{


    private Library bookLibrary;

    public ListBooks(Library bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public void execute(View view) {
        view.displayListOfBooks(bookLibrary.getAvailableBooks());
    }
}
