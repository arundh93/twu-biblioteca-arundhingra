package com.twu.biblioteca.parser;

import com.twu.biblioteca.menu.*;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class ParserTest {

    @Test
    public void canCreateListBooksCommandObjectWhenInputIsOne() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        Parser parser = new Parser();
        String input = "1";

        assertEquals(ListBooks.class, parser.parseInput(input, bookLibrary, movieLibrary).getClass());
    }

    @Test
    public void canCreateListMoviesCommandObjectWhenInputIsTwo() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        Parser parser = new Parser();
        String input = "2";

        assertEquals(ListMovies.class, parser.parseInput(input, bookLibrary, movieLibrary).getClass());
    }

    @Test
    public void canCreateQuitCommandObjectObjectWhenInputIsThree() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        Parser parser = new Parser();
        String input = "7";

        assertEquals(Quit.class, parser.parseInput(input, bookLibrary, movieLibrary).getClass());
    }

    @Test
    public void canCreateCheckOutCommandObjectForBooksWhenInputIsThree() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        Parser parser = new Parser();
        String input = "3";

        assertEquals(CheckOut.class, parser.parseInput(input, bookLibrary, movieLibrary).getClass());
    }

    @Test
    public void canCreateCheckInCommandForBooksObjectObjectWhenInputIsFour() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        Parser parser = new Parser();
        String input = "4";

        assertEquals(CheckIn.class, parser.parseInput(input, bookLibrary, movieLibrary).getClass());
    }

    @Test
    public void canCreateCheckOutCommandForObjectForMoviesWhenInputIsFour() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        Parser parser = new Parser();
        String input = "5";

        assertEquals(CheckOut.class, parser.parseInput(input, bookLibrary, movieLibrary).getClass());
    }

    @Test
    public void canCreateCheckInCommandForObjectForMoviesWhenInputIsFour() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);

        Parser parser = new Parser();
        String input = "6";

        assertEquals(CheckIn.class, parser.parseInput(input, bookLibrary, movieLibrary).getClass());
    }
}
