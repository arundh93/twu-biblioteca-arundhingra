package com.twu.biblioteca.parser;

import com.twu.biblioteca.menu.*;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.*;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class ParserTest {

    @Test
    public void canCreateListBooksCommandObjectWhenInputIsOne() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);
        ListItemView listItemView = Mockito.mock(ListItemView.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        Parser parser = new Parser(bookLibrary, movieLibrary, login, choiceView,listItemView);
        String input = "1";

        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        assertEquals(ListItem.class, parser.parseInput(input, viewInterface).getClass());
    }

    @Test
    public void canCreateListMoviesCommandObjectWhenInputIsTwo() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);

        ListItemView listItemView = Mockito.mock(ListItemView.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        Parser parser = new Parser(bookLibrary, movieLibrary, login, choiceView,listItemView);
        String input = "2";

        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        assertEquals(ListItem.class, parser.parseInput(input, viewInterface).getClass());
    }

    @Test
    public void canCreateQuitCommandObjectObjectWhenInputIsThree() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);

        ListItemView listItemView = Mockito.mock(ListItemView.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        Parser parser = new Parser(bookLibrary, movieLibrary, login, choiceView,listItemView);
        String input = "7";

        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        assertEquals(Quit.class, parser.parseInput(input, viewInterface).getClass());
    }

    @Test
    public void canCreateCheckOutCommandObjectForBooksWhenInputIsThree() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);

        ListItemView listItemView = Mockito.mock(ListItemView.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        Parser parser = new Parser(bookLibrary, movieLibrary, login, choiceView,listItemView);
        String input = "3";

        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        assertEquals(CheckOut.class, parser.parseInput(input, viewInterface).getClass());
    }

    @Test
    public void canCreateCheckInCommandForBooksObjectObjectWhenInputIsFour() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);

        ListItemView listItemView = Mockito.mock(ListItemView.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        Parser parser = new Parser(bookLibrary, movieLibrary, login, choiceView,listItemView);
        String input = "4";

        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        assertEquals(CheckIn.class, parser.parseInput(input, viewInterface).getClass());
    }

    @Test
    public void canCreateCheckOutCommandForObjectForMoviesWhenInputIsFour() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);

        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        ListItemView listItemView = Mockito.mock(ListItemView.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        Parser parser = new Parser(bookLibrary, movieLibrary, login, choiceView,listItemView);
        String input = "5";


        assertEquals(CheckOut.class, parser.parseInput(input, viewInterface).getClass());
    }

    @Test
    public void canCreateCheckInCommandForObjectForMoviesWhenInputIsFour() {
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Login login = Mockito.mock(Login.class);

        ListItemView listItemView = Mockito.mock(ListItemView.class);
        ChoiceView choiceView = Mockito.mock(ChoiceView.class);
        Parser parser = new Parser(bookLibrary, movieLibrary, login, choiceView,listItemView);
        String input = "6";

        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);

        assertEquals(CheckIn.class, parser.parseInput(input, viewInterface).getClass());
    }
}
