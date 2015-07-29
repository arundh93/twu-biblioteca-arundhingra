package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaController {

    private View view;
    private ArrayList<Book> books;
    public BibliotecaController(View view, ArrayList<Book> books) {
        this.view = view;
        this.books = books;
    }

    public void start() {
        view.displayWelcomeMessage();
        view.displayMenu();
        if(view.takeInput().equals("1"))
            view.displayListOfBooks(books);
        else if(view.takeInput().equals("quit"))
            System.exit(0);
        else if(view.takeInput().equals("2"))
            view.displayOutput("Invalid Input");
    }
}
