package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void canReturnBookList() {
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<Book> books1 = new ArrayList<Book>();
        books1.add(book1);
        books1.add(book2);
        Book book3 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book4 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<Book> books2 = new ArrayList<Book>();
        books2.add(book3);
        books2.add(book4);

        Library library = new Library(books2);

        assertEquals(books1, library.getBooks());
    }
}
