package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    @Test
    public void canGGetListListOfBooks() {
        Book book = new Book("Only Time Will Tell");

        assertEquals("Only Time Will Tell", book.getTitle());
    }


}
