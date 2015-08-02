package com.twu.biblioteca;

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
