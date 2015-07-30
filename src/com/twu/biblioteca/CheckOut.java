package com.twu.biblioteca;

import java.util.ArrayList;

public class CheckOut implements MenuOperation {

    public ArrayList<Book> execute(Library library, View view) {
        String bookName = view.takeInput();
        library.checkOutBook(library.getBookFromName(bookName));
        return library.getBooks();
    }
}
