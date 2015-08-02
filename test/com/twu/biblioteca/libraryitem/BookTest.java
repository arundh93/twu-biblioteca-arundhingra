package com.twu.biblioteca.libraryitem;

import com.twu.biblioteca.libraryitem.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;


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

}
