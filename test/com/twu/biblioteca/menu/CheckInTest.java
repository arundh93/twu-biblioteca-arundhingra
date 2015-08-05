package com.twu.biblioteca.menu;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.cglib.core.Local;


public class CheckInTest {

    @Test
    public void canReturnBook() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);
        CheckIn returnABook = new CheckIn(bookLibrary, login);
        View view = Mockito.mock(View.class);
        Mockito.when(view.takeInput()).thenReturn("only time will tell");
        Mockito.when(bookLibrary.returnLibraryItem("only time will tell", login)).thenReturn(true);
        returnABook.execute(view);
        Mockito.verify(view).displayOutput("enter the name");
        Mockito.verify(view).displayOutput("Thank you for returning!");
    }
}
