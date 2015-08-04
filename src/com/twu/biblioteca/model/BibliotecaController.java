package com.twu.biblioteca.model;

import com.twu.biblioteca.parser.Parser;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.menu.MenuOperation;

import java.util.ArrayList;


public class BibliotecaController {

    private View view;
    private ArrayList<Book> books;
    private Library bookLibrary;
    private Library movieLibrary;
    private Parser parser;

    public BibliotecaController(View view, Library bookLibrary, Library movieLibrary, Parser parser) {
        this.view = view;
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.parser = parser;
    }

    public void start(boolean shouldntExit) {
        view.displayWelcomeMessage();
        MenuOperation menuOperation;
        while(shouldntExit) {
            view.displayMenu();
            String input = view.takeInput();
            menuOperation = parser. parseInput(input, bookLibrary, movieLibrary);
            menuOperation.execute(view);
        }
    }
}