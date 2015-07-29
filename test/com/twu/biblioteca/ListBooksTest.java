package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class ListBooksTest {

    @Test
    public void canReturnListOfBooks() {
        ListBooks listOfBooks = new ListBooks();
        Library library = Mockito.mock(Library.class);

        listOfBooks.execute(library);

        Mockito.verify(library).getBooks();
    }

}