package com.twu.biblioteca.libraryitem;

public class Book implements LibraryItem{
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
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

    @Override
    public boolean hasTitle(LibraryItem name) {
        return this.equals(name);
    }

    @Override
    public String toString() {
        return String.format("%-25s %-25s %-25s", getTitle(), getAuthor(), Integer.toString(getPublicationYear()));
    }
}


