package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
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
    public void canDisplayMessage() {
        View view = new View();
        view.displayWelcomeMessage();

        assertEquals("***** Welcome To Biblioteca *****\n", outContent.toString());
    }
}