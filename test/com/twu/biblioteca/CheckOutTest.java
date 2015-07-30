package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;


public class CheckOutTest {

    @Test
    public void checkOutCommandCanCheckOutBook() {
        CheckOut checkOut = new CheckOut();
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<Book> books1 = new ArrayList<Book>();
        books1.add(book1);
        books1.add(book2);
        Library library = new Library(books1);
        View view = Mockito.mock(View.class);
        Mockito.when(view.takeInput()).thenReturn("only time will tell");

        checkOut.execute(library, view);

        Mockito.verify(view).displayListOfBooks(library.getBooks());
    }
}