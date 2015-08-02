package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class ListMovies implements MenuOperation {

    private Library movieLibrary;

    public ListMovies(Library movieLibrary) {

        this.movieLibrary = movieLibrary;
    }

    @Override
    public void execute(View view){
        view.displayListOfBooks(movieLibrary.getAvailableBooks());
    }
}
