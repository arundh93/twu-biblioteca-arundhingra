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

    private void convertBookListToStringFormat(Library library, ArrayList<String> bookDetails) {
        for (int i = 0; i < library.getBooks().size(); i++) {
            bookDetails.clear();
            library.getBooks().get(i).convertBookDetailsToString(bookDetails, view);
        }
    }

    public void run() {
        view.displayOutput("##### MAIN MENU #####");
        view.displayOutput("1. show list of books");
        String input = view.takeInput();
        if (Integer.parseInt(input) == 1) {
            this.convertBookListToStringFormat(library, bookDetails);
        }
    }
}
