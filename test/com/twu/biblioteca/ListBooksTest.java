package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;


public class ListBooksTest {

    @Test
    public void canReturnListOfBooks() {
        ListBooks listOfBooks = new ListBooks();
        Library library = Mockito.mock(Library.class);
        View view = Mockito.mock(View.class);
        ArrayList<Book> bookList= new ArrayList<Book>();
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        bookList.add(book1);
        bookList.add(book2);
        listOfBooks.execute(library, view);

        Mockito.verify(view).displayListOfBooks(library.getAvailableBooks());
    }
}