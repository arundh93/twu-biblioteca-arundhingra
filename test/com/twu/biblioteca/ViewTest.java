package com.twu.biblioteca;

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
    public void canDisplayWelcomeMessage() {
        View view = new View();

        view.displayWelcomeMessage();

        assertEquals("***** Welcome To Biblioteca *****\n", outContent.toString());
    }

    @Test
    public void canDisplayListOfBooks() {
        View view = new View();
        Book b1 = new Book("book1", "Jeffery Archer", 2011);
        Book b2 = new Book("book2", "Jeffery Archer", 2009);

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        Library library = new Library(books);


    }
}
