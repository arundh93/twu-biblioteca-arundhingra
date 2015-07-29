package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;
import java.util.ArrayList;

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
        BibliotecaController bibliotecaController = new BibliotecaController(view, books, new ArrayList<String>());
        Mockito.when(view.takeInput()).thenReturn("1");
        bibliotecaController.start();

        verify(view).displayWelcomeMessage();
    }

}
