package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaControllerTest {

    @Test
    public void canDisplayWelcomeMessage() {
        View view = mock(View.class);
        Book b1 = Mockito.mock(Book.class);
        Book b2 = Mockito.mock(Book.class);
        ArrayList<LibraryItem> books = new ArrayList<LibraryItem>();
        books.add(b1);
        books.add(b2);
        ArrayList<LibraryItem> checkOutBooks = new ArrayList<LibraryItem>();
        MenuOperation menuOperation = Mockito.mock(MenuOperation.class);
        Parser parser = Mockito.mock(Parser.class);
        Library bookLibrary = Mockito.mock(Library.class);
        Library movieLibrary = Mockito.mock(Library.class);
        Mockito.when(parser.parseInput("1", bookLibrary, movieLibrary)).thenReturn(menuOperation);

        BibliotecaController bibliotecaController = new BibliotecaController(view, bookLibrary, movieLibrary, parser);
        Mockito.when(view.takeInput()).thenReturn("1");
        bibliotecaController.start(false);

        verify(view).displayWelcomeMessage();
    }
}
