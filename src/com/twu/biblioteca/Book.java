package com.twu.biblioteca;

import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object thatBook) {
        if (this == thatBook) return true;
        if (thatBook == null || getClass() != thatBook.getClass()) return false;

        Book that = (Book) thatBook;

        return !(title != null ? !title.equals(that.title) : that.title != null);
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    public void convertBookDetailsToString(ArrayList<String> bookDetails, View view) {
        bookDetails.add(this.title);
        bookDetails.add(this.author);
        bookDetails.add(Integer.toString(this.publicationYear));
        view.displayOutput(bookDetails.get(0));
        view.displayOutput(bookDetails.get(1));
        view.displayOutput(bookDetails.get(2));
    }
}


