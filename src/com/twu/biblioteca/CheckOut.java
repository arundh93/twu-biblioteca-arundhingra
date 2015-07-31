package com.twu.biblioteca;

public class CheckOut implements MenuOperation {

    public void execute(Library library, View view) {
        view.displayOutput("Enter name of the book");
        String bookName = view.takeInput();
        if (library.isBookPresent(bookName, true)) {
            Book book = library.getBookFromName(bookName, true);
            library.checkOutBook(book);
            view.displayOutput("Enjoy the Book!\n");
            view.displayListOfBooks(library.getAvailableBooks());
        }
        else {
            view.displayOutput("Book not available in the library!");
        }
    }
}
