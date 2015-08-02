package com.twu.biblioteca;

import java.util.ArrayList;


public class Library {
    private ArrayList<LibraryItem> availableList;
    private ArrayList<LibraryItem> checkOutList;

    public Library(ArrayList<LibraryItem> availableList, ArrayList<LibraryItem> checkOutList) {
        this.availableList = availableList;
        this.checkOutList = checkOutList;
    }

    public ArrayList<LibraryItem> getAvailableBooks() {
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

    public boolean isBookPresent(String name, ArrayList<LibraryItem> bookList) {

        boolean test = false;
        for (LibraryItem book : bookList) {
            if (book.hasTitle(getBookFromName(name, bookList)))
                test = true;
        }
        return test;
    }


    public LibraryItem getBookFromName(String name, ArrayList<LibraryItem> bookList) {

        for (LibraryItem book : bookList) {
            if (book.getTitle().equals(name))
                return book;
        }
        return null;
    }

}
