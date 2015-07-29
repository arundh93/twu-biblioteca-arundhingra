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
        run();
    }


    public void run() {
        view.displayOutput("##### MAIN MENU #####");
        view.displayOutput("1. show list of books");
        String input = view.takeInput();
        menuOptions(input);
    }

    public void menuOptions(String input) {
        if (Integer.parseInt(input) == 1) {
            library.convertBookListToStringFormat(bookDetails, view);
        }
    }
}
