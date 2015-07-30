package com.twu.biblioteca;

import java.util.ArrayList;

public class ReturnBook implements MenuOperation {

    @Override
    public void execute(Library library, View view) {
        view.displayOutput("enter the book to return");
        String input = view.takeInput();
        if (library.isBookPresent(input)) {
            Book book = library.getBookFromName(input);
            if (book != null && !book.isBookInLibrary()) {
                library.returnBook(input);
                view.displayOutput("Thank you for returning the book");
            } else {
                view.displayOutput("book does not belong to this library");
            }
        } else {
            view.displayOutput("book does not belong to this library");
        }
    }
}
