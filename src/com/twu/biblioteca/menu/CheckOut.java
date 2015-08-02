package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckOut implements MenuOperation {

    private Library library;

    public CheckOut(Library library) {
        this.library = library;
    }

    public void execute(View view) {
        view.displayOutput("Enter name of the book");
        String bookName = view.takeInput();
        if (library.checkOutLibraryItem(bookName)) {
            view.displayOutput("Enjoy the Book!\n");
        }
        else {
            view.displayOutput("Sorry! Book not available in the library");
        }
    }
}

