package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class ListBooks implements MenuOperation{


    private Library bookLibrary;

    public ListBooks(Library bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public void execute(View view) {
        view.displayListOfBooks(bookLibrary.getAvailableItems());
    }
}
