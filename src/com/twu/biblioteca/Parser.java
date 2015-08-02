package com.twu.biblioteca;

public class Parser {
    public MenuOperation parseInput(String input, Library bookLibrary, Library movieLibrary) {
        if(input.equals("1"))
            return new ListBooks(bookLibrary);
        else if(input.equals("2"))
            return new ListMovies(movieLibrary);
        else if (input.equals("3"))
            return new CheckOut(bookLibrary);
        else if(input.equals("7"))
            return new Quit();
        else if(input.equals("4"))
            return new CheckIn(bookLibrary);
        else if(input.equals("5"))
            return new CheckOut(movieLibrary);
        else if (input.equals("6"))
            return new CheckIn(movieLibrary);
        return new InvalidOption();
    }
}
