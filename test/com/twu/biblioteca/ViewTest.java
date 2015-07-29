package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

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
    public void canTakeInputFromUser() {
        View view = new View();
        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("1", view.takeInput());
    }
}
