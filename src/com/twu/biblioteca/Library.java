package com.twu.biblioteca;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public int lengthOfList() {
        return books.size();
    }

    public Book getBookFromName(String name) {
        for (Book book : books)
            if (book.getTitle().equals(name))
                return book;
        return null;
    }
}
