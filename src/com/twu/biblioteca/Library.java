package com.twu.biblioteca;

import java.util.ArrayList;


public class Library {
    private ArrayList<Book> availableList;
    private ArrayList<Book> checkOutList;

    public Library(ArrayList<Book> availableList, ArrayList<Book> checkOutList) {
        this.availableList = availableList;
        this.checkOutList = checkOutList;
    }

    public ArrayList<Book> getAvailableBooks() {
        return availableList;
    }

    public boolean checkOutBook(String bookName) {
        if (isBookPresent(bookName, availableList)) {
            availableList.remove(getBookFromName(bookName, availableList));
            checkOutList.add(getBookFromName(bookName, checkOutList));
            return true;
        } else
            return false;
    }

    public boolean returnBook(String bookName) {
        if (isBookPresent(bookName, availableList)) {
            availableList.add(getBookFromName(bookName, availableList));
            checkOutList.remove(getBookFromName(bookName, checkOutList));
            return true;
        }
        else
            return false;
    }

    public boolean isBookPresent(String name, ArrayList<Book> bookList) {

        boolean test = false;
        for (Book book : bookList) {
            if (book.hasTitle(getBookFromName(name, bookList)))
                test = true;
        }
        return test;
    }


    public Book getBookFromName(String name, ArrayList<Book> bookList) {

        for (Book book : bookList) {
            if (book.getTitle().equals(name))
                return book;
        }
        return null;
    }

}
