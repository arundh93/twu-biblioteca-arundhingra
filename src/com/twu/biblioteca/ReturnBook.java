package com.twu.biblioteca;

import java.util.ArrayList;

public class ReturnBook implements MenuOperation{

    @Override
    public ArrayList<Book> execute(Library library, View view) {
        String input = view.takeInput();
        library.returnBook(input);
        return library.getBooks();
    }
}
