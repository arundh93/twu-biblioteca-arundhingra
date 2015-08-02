package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckIn implements MenuOperation {

    private Library library;

    public CheckIn(Library library) {
        this.library = library;
    }

    @Override
    public void execute(View view) {
        view.displayOutput("enter the book to return");
        String input = view.takeInput();
        if (library.returnLibraryItem(input)) {
            view.displayOutput("Thank you for returning the book!");
        }
        else {
            view.displayOutput("This book does not belong to the library");
        }
    }
}
