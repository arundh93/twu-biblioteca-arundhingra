package com.twu.biblioteca.view;

import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.libraryitem.LibraryItem;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class ViewTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream original;

    @Before
    public void setUpStreams() {
        original = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(original);
    }

    @Test
    public void canDisplayListOfBooks() {
        View view = new View();
        ArrayList<LibraryItem> books= new ArrayList<LibraryItem>();
        books.add(new Book("book1", "ram", 2000));
        books.add(new Book("book2", "sham", 2010));

        view.displayList(books);

        assertEquals(
                "book1                     ram                       2000                     \n" +
                "book2                     sham                      2010                     \n", outContent.toString());
    }
}
