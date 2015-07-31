package com.twu.biblioteca;

public class ReturnBook implements MenuOperation {

    @Override
    public void execute(Library library, View view) {
        view.displayOutput("enter the book to return");
        String input = view.takeInput();
        if (library.isBookPresent(input, false)) {
            Book book = library.getBookFromName(input, false);
            library.returnBook(book);
            view.displayOutput("Thank you for returning the book!");
        } else {
            view.displayOutput("book does not belong to this library");
        }
    }
}
