package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BookTest {

    @Test
    public void canGetTitleOfBook() {
        Book book = new Book("Only Time Will Tell", "Jeffery Archer", 2011);

        assertEquals("Only Time Will Tell", book.getTitle());
    }

    @Test
    public void canGetAuthorOfBook() {
        Book book = new Book("Only Time Will Tell", "Jeffery Archer", 2011);

        assertEquals("Jeffery Archer", book.getAuthor());
    }

    @Test
    public void canGetPublicationYearOfBook() {
        Book book = new Book("Only Time Will Tell", "Jeffery Archer", 2011);

        assertEquals(2011, book.getPublicationYear());
    }

    @Test
    public void canTellWhetherItIsInLibrary() {
        Book book = new Book("Only Time Will Tell", "Jeffery Archer", 2011);

        assertEquals(true, book.isBookInLibrary());
    }

    @Test
    public void canChangeStatusOfBeingCheckOutLibrary() {
        Book book = new Book("Only Time Will Tell", "Jeffery Archer", 2011);

        book.checkOutFromLibrary();

        assertEquals(false, book.isBookInLibrary());
    }
}
