package com.twu.biblioteca;

public class ReturnBook implements MenuOperation {

    @Override
    public void execute(Library library, View view) {
        view.displayOutput("enter the book to return");
        String input = view.takeInput();
        if (library.returnBook(input)) {
            view.displayOutput("Thank you for returning the book!");
        }
        else {
            view.displayOutput("This book does not belong to the library");
        }
    }
}
