package com.twu.biblioteca;

import java.util.ArrayList;


public class BibliotecaController {

    private View view;
    private ArrayList<Book> books;
    private Library library;
    private Parser parser;

    public BibliotecaController(View view, Library library, Parser parser) {
        this.view = view;
        this.library = library;
        this.parser = parser;
    }

    public void start(boolean shouldntExit) {
        view.displayWelcomeMessage();
        MenuOperation menuOperation;
        while(shouldntExit) {
            view.displayMenu();
            String input = view.takeInput();
            menuOperation = parser.parseInput(input);
            view.displayListOfBooks(menuOperation.execute(library, view));
        }
    }
}
