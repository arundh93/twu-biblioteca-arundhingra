package com.twu.biblioteca;

import com.twu.biblioteca.libraryitem.LibraryItem;

import java.util.ArrayList;

public class User {

    private final String name;
    private final String email;
    private final String phoneNumber;
    private ArrayList<LibraryItem> issuedBooks;
    private final ArrayList<LibraryItem> issuedMovies;
    private String passward;
    private String userName;

    public User(String name, String email, String phoneNumber, ArrayList<LibraryItem> issuedBooks, ArrayList<LibraryItem> issuedMovies, String passward, String userName) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.issuedBooks = issuedBooks;
        this.issuedMovies = issuedMovies;
        this.passward = passward;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return String.format("%-25s %-25s %-25s", name, email, phoneNumber);
    }

    public ArrayList<LibraryItem> getIssuedBooks() {
        return issuedBooks;
    }

    public ArrayList<LibraryItem> getIssuedMovies() {
        return issuedMovies;
    }

    public boolean verify(String name, String pass) {
        return userName.equals(name) && passward.equals(pass);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (passward != null ? !passward.equals(user.passward) : user.passward != null) return false;
        return !(userName != null ? !userName.equals(user.userName) : user.userName != null);

    }

    @Override
    public int hashCode() {
        int result = passward != null ? passward.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }
}
