package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class BibliotecaControllerTest {

    @Test
    public void canDisplayWelcomeMessage() {
        View view = mock(View.class);
        Library books =mock(Library.class);
        BibliotecaController bibliotecaController = new BibliotecaController(view, books, new ArrayList<String>());

        bibliotecaController.start();

        verify(view).displayWelcomeMessage();
    }

    @Test
    public void canConvertBookDetailsToString() {
        View view = Mockito.mock(View.class);
        Library books = Mockito.mock(Library.class);
        BibliotecaController bibliotecaController = new BibliotecaController(view, books, new ArrayList<String>());
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("only time will tell"));
        listOfBooks.add(new Book("sins of a father"));
        when(books.getBooks()).thenReturn(listOfBooks);

        bibliotecaController.convertBookDetailsToString(books, new ArrayList<String>());

        verify(view).displayOutput("only time will tell");
        verify(view).displayOutput("sins of a father");
    }
}
