package com.twu.biblioteca;


public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isInLibrary;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isInLibrary = true;
    }

    public boolean isBookInLibrary() {
        return isInLibrary;
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

    public void checkOutFromLibrary() {
        isInLibrary = false;
    }

    public void returnInLibrary() {
        isInLibrary = true;
    }
}


