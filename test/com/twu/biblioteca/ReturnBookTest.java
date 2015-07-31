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
        Book book = Mockito.mock(Book.class);

        Mockito.verify(library).returnBook(book);
        Mockito.verify(library).getAvailableBooks();
    }
}
