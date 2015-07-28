package com.twu.biblioteca;

public class View {
    public void displayWelcomeMessage() {
        displayOutput("***** Welcome To Biblioteca *****");
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }

    public void displayListOfBooks(Library library) {
        displayOutput(library.getBooks().toString());
    }
}

