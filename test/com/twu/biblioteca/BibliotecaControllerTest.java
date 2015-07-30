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
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        MenuOperation menuOperation = Mockito.mock(MenuOperation.class);
        Parser parser = Mockito.mock(Parser.class);
        Mockito.when(parser.parseInput(anyString())).thenReturn(menuOperation);
        Library library = new Library(books);
        Mockito.when(menuOperation.execute(library, view)).thenReturn(books);
        BibliotecaController bibliotecaController = new BibliotecaController(view, library, parser);
        Mockito.when(view.takeInput()).thenReturn("1");
        bibliotecaController.start(false);

        verify(view).displayWelcomeMessage();
    }
}
