package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.*;
import org.junit.Test;
import org.mockito.Mockito;


public class CheckOutTest {

    @Test
    public void checkOutCommandCanCheckOutBook() {
        Library bookLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        View view = Mockito.mock(View.class);
        CheckOut checkOutABook = new CheckOut(bookLibrary, login, view, "book");

        Mockito.when(view.takeInputOfItem(Mockito.anyString())).thenReturn("prodigal daughter");
        Mockito.when(bookLibrary.checkOutLibraryItem("prodigal daughter", login)).thenReturn(true);
        checkOutABook.execute(viewInterface);

        Mockito.verify(view).showCheckOutMessage("book");
    }
}