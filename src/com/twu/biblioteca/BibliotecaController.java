package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaController {

    private  View view;

    public BibliotecaController(View view) {
        this.view = view;
    }

    public void start() {
        view.displayWelcomeMessage();
    }

    public void convertBookDetailsToString(Library books, ArrayList<String> bookDetails) {
        ArrayList<Book> listOfBooks;
        listOfBooks = books.getBooks();
        for (int i = 0; i < listOfBooks.size(); i++) {
            bookDetails.add(listOfBooks.get(i).getTitle());
            view.displayOutput(bookDetails.get(i));
        }
    }
}
