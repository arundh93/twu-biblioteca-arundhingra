package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaController {

    private Library library;
    private View view;
    private ArrayList<String> bookDetails;
    public BibliotecaController(View view, Library library, ArrayList<String> bookDetails) {
        this.view = view;
        this.library = library;
        this.bookDetails = bookDetails;
    }

    public void start() {
        view.displayWelcomeMessage();
        this.convertBookDetailsToString(library, bookDetails);
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
