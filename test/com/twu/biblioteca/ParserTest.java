package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ParserTest {

    @Test
    public void canCreateListBooksCommandObjectWhenInputIsOne() {
        Parser parser = new Parser();
        String input = "1";

        assertEquals(ListBooks.class, parser.parseInput(input).getClass());
    }

    @Test
    public void canCreateCheckOutCommandObjectWhenInputIsTwo() {
        Parser parser = new Parser();
        String input = "2";

        assertEquals(CheckOut.class, parser.parseInput(input).getClass());
    }

    @Test
    public void canCreateQuitCommandObjectObjectWhenInputIsThree() {
        Parser parser = new Parser();
        String input = "4";

        assertEquals(Quit.class, parser.parseInput(input).getClass());
    }

    @Test
    public void canCreateReturnCommandObjectObjectWhenInputIsThree() {
        Parser parser = new Parser();
        String input = "3";

        assertEquals(ReturnBook.class, parser.parseInput(input).getClass());
    }
}
