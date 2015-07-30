package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckOut implements MenuOperation {

    public void execute(Library library, View view) {
        view.displayOutput("Enter name of the book");
        String bookName = view.takeInput();
        if(library.isBookPresent(bookName)) {
            Book book = library.getBookFromName(bookName);
            if (book.isBookInLibrary()) {
                library.checkOutBook(library.getBookFromName(bookName));
                view.displayOutput("Enjoy the book!");
            }
            else {
                view.displayOutput("Sorry! Book is issued");
            }
        }
        else {
            view.displayOutput("Sorry! Book not in the library");
        }
    }
}
