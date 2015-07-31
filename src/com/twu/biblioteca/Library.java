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

    public void checkOutBook(Book book) {
        availableList.remove(book);
        checkOutList.add(book);
    }

    public boolean isBookPresent(String name, boolean checkFromAvailableList) {
        ArrayList <Book> iterator;
        if(checkFromAvailableList)
            iterator = availableList;
        else
            iterator = checkOutList;

        boolean test = false;
        for(Book book : iterator) {
            if(book.hasTitle(getBookFromName(name, checkFromAvailableList)))
                test = true;
        }
        return test;
    }


    public Book getBookFromName(String name, boolean checkFromAvailableList) {
        ArrayList <Book> iterator;
        if(checkFromAvailableList)
            iterator = availableList;
        else
            iterator = checkOutList;

        for (Book book : iterator) {
            if(book.getTitle().equals(name))
                return book;
        }
        return null;
    }

    public void returnBook(Book book) {
        availableList.add(book);
        checkOutList.remove(book);
    }

}
