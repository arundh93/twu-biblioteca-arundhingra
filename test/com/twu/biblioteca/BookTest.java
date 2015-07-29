package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BookTest {

    @Test
    public void canGetListListOfBooks() {
        Book book = new Book("Only Time Will Tell", "Jeffery Archer", 2011);

        assertEquals("Only Time Will Tell", book.getTitle());
    }
}
