package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaController {

    private View view;
    private ArrayList<String> bookDetails;
    private ArrayList<Book> books;
    public BibliotecaController(View view, ArrayList<Book> books, ArrayList<String> bookDetails) {
        this.view = view;
        this.books = books;
        this.bookDetails = bookDetails;
    }

    public void start() {
        view.displayWelcomeMessage();
        view.displayMenu();
        if(view.takeInput().equals("1"))
            view.displayListOfBooks(books);
    }
}
