package com.twu.biblioteca;

import java.util.ArrayList;

public class ReturnBook implements MenuOperation{

    @Override
    public ArrayList<Book> execute(Library library, View view) {
        String input = view.takeInput();
        Book book = library.getBookFromName(input);
        if(book != null && !book.isBookInLibrary())
            library.returnBook(input);
        else
            view.displayOutput("book does not belong to this library");
        return library.getBooks();
    }
}
