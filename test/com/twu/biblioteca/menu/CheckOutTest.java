package com.twu.biblioteca.menu;


import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.ChoiceView;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

public class CheckOutTest {

    @Test
    public void checkOutCommandCanCheckOutBook() {
        Library bookLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        SuccessfulView successfulView = Mockito.mock(SuccessfulView.class);
        UnSuccessfulView unSuccessfulView = Mockito.mock(UnSuccessfulView.class);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);


        Mockito.when(choiceView.execute("book")).thenReturn("prodigal daughter");
        Mockito.when(bookLibrary.checkOutLibraryItem("prodigal daughter", login)).thenReturn(true);

        CheckOut checkOutABook = new CheckOut(bookLibrary, login, choiceView, successfulView, unSuccessfulView, "book", viewInterface);
        checkOutABook.execute();
        Mockito.verify(successfulView).showCheckOutMessage("book");
    }
}