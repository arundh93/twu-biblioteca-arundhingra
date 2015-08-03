package com.twu.biblioteca;

import com.twu.biblioteca.libraryitem.LibraryItem;

import java.util.ArrayList;

public class User {

    private final String name;
    private final String email;
    private final String phoneNumber;
    private ArrayList<LibraryItem> issuedBooks;
    private final ArrayList<LibraryItem> issuedMovies;

    public User(String name, String email, String phoneNumber, ArrayList<LibraryItem> issuedBooks, ArrayList<LibraryItem> issuedMovies) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.issuedBooks = issuedBooks;
        this.issuedMovies = issuedMovies;
    }

    @Override
    public String toString() {
        return String.format("%-25s %-25s %-25s", name, email, phoneNumber);
    }

    public ArrayList<LibraryItem> getIssuedBooks() {
        return issuedBooks;
    }
}
