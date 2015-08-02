package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void canReturnBookList() {
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<LibraryItem> books1 = new ArrayList<LibraryItem>();
        books1.add(book1);
        books1.add(book2);
        Book book3 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book4 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<LibraryItem> books2 = new ArrayList<LibraryItem>();
        books2.add(book3);
        books2.add(book4);
        ArrayList<LibraryItem> checkOutBooks = new ArrayList<LibraryItem>();
        Library library = new Library(books2, checkOutBooks);

        assertEquals(books1, library.getAvailableBooks());
    }

    @Test
    public void canReturnBookByProvidingName() {
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<LibraryItem> books1 = new ArrayList<LibraryItem>();
        books1.add(book1);
        books1.add(book2);
        ArrayList<LibraryItem> checkOutBooks = new ArrayList<LibraryItem>();
        Library library = new Library(books1, checkOutBooks);

        assertEquals(book1, library.getBookFromName("only time will tell", books1));
    }

    @Test
    public void bookCanBeReturnedToLibrary() {
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<LibraryItem> books1 = new ArrayList<LibraryItem>();
        books1.add(book1);
        books1.add(book2);
        ArrayList<LibraryItem> checkOutBooks = new ArrayList<LibraryItem>();
        Library library = new Library(books1, checkOutBooks);
        LibraryItem book5 = library.getBookFromName("only time will tell", books1);
        ArrayList<LibraryItem> expected = new ArrayList<LibraryItem>();
        library.returnBook("only time will tell");
        expected.add(book1);
        expected.add(book2);
        expected.add(book5);

        assertEquals(expected, books1);
    }
}
