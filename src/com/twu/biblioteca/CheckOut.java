package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckOut implements MenuOperation {

    public ArrayList<Book> execute(Library library, View view) {
        String bookName = view.takeInput();
        Book book = library.getBookFromName(bookName);
        if(book != null && book.isBookInLibrary())
            library.checkOutBook(library.getBookFromName(bookName));
        else
            view.displayOutput("book not in the library");
        return library.getBooks();
    }
}
