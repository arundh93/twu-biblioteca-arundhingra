package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParserTest {

    @Test
    public void canCreateListBooksObject() {
        Parser parser = new Parser();
        String input = "1";

        assertEquals(ListBooks.class, parser.parseInput(input).getClass());
    }

    @Test
    public void canCreateCheckOutObject() {
        Parser parser = new Parser();
        String input = "1";

        assertEquals(CheckOut.class, parser.parseInput(input).getClass());
    }
}
