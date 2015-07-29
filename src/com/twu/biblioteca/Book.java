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

    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
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

}


