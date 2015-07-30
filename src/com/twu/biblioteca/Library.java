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

    public void checkOutBook(Book book) {
        book.checkOutFromLibrary();
    }

    public Book getBookFromName(String name) {
        for (Book book : books)
            if (book.getTitle().equals(name))
                return book;
        return null;
    }

    public void returnBook(String bookName) {
        Book book = getBookFromName(bookName);
        book.returnInLibrary();
    }
}
