package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.atLeast;


public class CheckInTest {

    @Test
    public void canReturnBook() {
        Library bookLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        View view = Mockito.mock(View.class);

        Mockito.when(view.takeInputOfItem(Mockito.anyString())).thenReturn("prodigal daughter");
        Mockito.when(bookLibrary.returnLibraryItem(("prodigal daughter"), login)).thenReturn(true);
        CheckIn returnABook = new CheckIn(bookLibrary, login, view, "book");
        returnABook.execute(viewInterface);
        Mockito.verify(view, atLeast(1)).showCheckInMessage("book");
    }
}
