package com.twu.biblioteca;

public class CheckOut implements MenuOperation {

    public void execute(Library library, View view) {
        view.displayOutput("Enter name of the book");
        String bookName = view.takeInput();
        if (library.checkOutBook(bookName)) {
            view.displayOutput("Enjoy the Book!\n");
        }
        else {
            view.displayOutput("Sorry! Book not available in the library");
        }
    }
}

