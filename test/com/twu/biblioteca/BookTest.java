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

    @Test
    public void canConvertBookDetailsToString() {
        View view = Mockito.mock(View.class);
        Book book = new Book("Only time Will Tell", "Jeffery Archer", 2011);

        book.convertBookDetailsToString(new ArrayList<String>(), view);

        verify(view).displayOutput("Only time Will Tell");
        verify(view).displayOutput("Jeffery Archer");
        verify(view).displayOutput("2011");
    }


}
