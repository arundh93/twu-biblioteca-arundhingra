package com.twu.biblioteca.model;

import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.libraryitem.LibraryItem;
import org.junit.Test;
import org.mockito.Mockito;

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
        ArrayList<String> ownership = new ArrayList<String>();
        ArrayList<LibraryItem> checkOutBooks = new ArrayList<LibraryItem>();
        Library library = new Library(books2, checkOutBooks, ownership);

        assertEquals(books1, library.getAvailableItems());
    }

    @Test
    public void canReturnBookByProvidingName() {
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<LibraryItem> books1 = new ArrayList<LibraryItem>();
        books1.add(book1);
        books1.add(book2);
        ArrayList<LibraryItem> checkOutBooks = new ArrayList<LibraryItem>();
        ArrayList<String> ownership = new ArrayList<String>();

        Library library = new Library(books1, checkOutBooks, ownership);

        assertEquals(book1, library.getItemFromName("only time will tell", books1));
    }


    @Test
    public void canReCheckedOut() {
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        ArrayList<LibraryItem> availableList = new ArrayList<LibraryItem>();
        availableList.add(book1);
        availableList.add(book2);
        ArrayList<String> ownership = new ArrayList<String>();

        ArrayList<LibraryItem> checkOutBooks = new ArrayList<LibraryItem>();
        Library library = new Library(availableList, checkOutBooks, ownership);
        Login login = Mockito.mock(Login.class);
        library.checkOutLibraryItem("only time will tell", login);

        assertEquals(checkOutBooks, library.getCheckedOutItems());
    }
}
