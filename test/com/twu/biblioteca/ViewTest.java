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
        ArrayList<LibraryItem> books= new ArrayList<LibraryItem>();
        books.add(new Book("book1", "ram", 2000));
        books.add(new Book("book2", "sham", 2010));

        view.displayListOfBooks(books);

        assertEquals(
                "book1                     ram                       2000                     \n" +
                "book2                     sham                      2010                     \n", outContent.toString());
    }

    @Test
    public void canDisplayMenu() {
        View view = new View();

        view.displayMenu();

        assertEquals("\n***** Main Menu *****\n" +
                "1. List Books\n" +
                "2. List Movies\n" +
                "3. Checkout Book\n" +
                "4. Return book\n" +
                "5. Checkout Movie\n" +
                "6. Return Movie\n" +
                "7. Quit\n" +
                "\n" +
                "Enter an option (1/2/3/4/5/6/7)\n", outContent.toString());
    }
}
