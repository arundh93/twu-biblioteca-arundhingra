package com.twu.biblioteca.menu;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;


public class CheckOutTest {

    @Test
    public void checkOutCommandCanCheckOutBook() {
        Library library = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);

        CheckOut checkOut = new CheckOut(library, login);
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<Book> books1 = new ArrayList<Book>();
        books1.add(book1);
        books1.add(book2);
        View view = Mockito.mock(View.class);
        Mockito.when(view.takeInput()).thenReturn("only time will tell");
        Mockito.when(library.checkOutLibraryItem("only time will tell", login)).thenReturn(true);
        checkOut.execute(view);
        Mockito.verify(view).displayOutput("Enter the name");
    }
}