package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.test.Controller;
import com.twu.biblioteca.view.*;
import org.junit.Test;
import org.mockito.Mockito;


public class CheckInTest {

    @Test
    public void canReturnBook() {
        Library bookLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        SuccessfulView successfulView = Mockito.mock(SuccessfulView.class);
        UnSuccessfulView unSuccessfulView = Mockito.mock(UnSuccessfulView.class);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        Mockito.when(choiceView.execute("book")).thenReturn("prodigal daughter");
        Mockito.when(bookLibrary.returnLibraryItem("prodigal daughter", login)).thenReturn(true);

        CheckIn returnABook = new CheckIn(bookLibrary, login, choiceView, successfulView, unSuccessfulView, "book", viewInterface);
        returnABook.execute();
        Mockito.verify(successfulView).showCheckInMessage("book");
    }
}
