package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;


public class ReturnBookTest {

    @Test
    public void canReturnBook() {
        ReturnBook returnABook = new ReturnBook();
        Library library = Mockito.mock(Library.class);
        View view = Mockito.mock(View.class);
        Mockito.when(view.takeInput()).thenReturn("only time will tell");
        Mockito.when(library.returnBook(Mockito.anyString())).thenReturn(true);
        returnABook.execute(library, view);
        Mockito.verify(view).displayOutput("enter the book to return");
        Mockito.verify(view).displayOutput("Thank you for returning the book!");
    }
}
