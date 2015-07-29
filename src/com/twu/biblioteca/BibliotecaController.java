package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaController {

    private View view;
    private ArrayList<Book> books;
    private Library library;

    public BibliotecaController(View view, Library library) {
        this.view = view;
        this.library = library;
    }

    public void start() {
        view.displayWelcomeMessage();
        view.displayMenu();
        if(view.takeInput().equals("1"))
            view.displayListOfBooks(library.getBooks());
        else if(view.takeInput().equals("quit"))
            System.exit(0);
        else if(view.takeInput().equals("2"))
            view.displayOutput("Invalid Input");
    }
}
