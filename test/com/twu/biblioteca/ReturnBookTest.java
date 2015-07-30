package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class ReturnBookTest {

    @Test
    public void canReturnBook() {
        ReturnBook returnABook = new ReturnBook();
        Library library = Mockito.mock(Library.class);
        View view = Mockito.mock(View.class);
            Mockito.when(view.takeInput()).thenReturn("only time will tell");
        returnABook.execute(library, view);

        Mockito.verify(library).returnBook("only time will tell");
        Mockito.verify(library).getBooks();
    }
}
