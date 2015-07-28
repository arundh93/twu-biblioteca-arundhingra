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
        this.convertBookListToStringFormat(library, bookDetails);
    }

    private void convertBookListToStringFormat(Library library, ArrayList<String> bookDetails) {
        for(int i = 0; i < library.getBooks().size(); i++) {
            bookDetails.clear();
            library.getBooks().get(i).convertBookDetailsToString(bookDetails, view);
        }
    }

}
