package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class CheckInTest {

    @Test
    public void canReturnBook() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        CheckIn returnABook = new CheckIn(bookLibrary);
        View view = Mockito.mock(View.class);
        Mockito.when(view.takeInput()).thenReturn("only time will tell");
        Mockito.when(bookLibrary.returnBook(Mockito.anyString())).thenReturn(true);
        returnABook.execute(view);
        Mockito.verify(view).displayOutput("enter the book to return");
        Mockito.verify(view).displayOutput("Thank you for returning the book!");
    }
}
