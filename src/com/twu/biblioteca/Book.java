package com.twu.biblioteca;

public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
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
}
