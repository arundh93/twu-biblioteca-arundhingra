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
        Mockito.when(view.takeInput()).thenReturn("1");
        bibliotecaController.start();

        verify(view).displayWelcomeMessage();
    }

    @Test
    public void canDisplayMainMenu() {
        View view = mock(View.class);
        Library books =mock(Library.class);
        BibliotecaController bibliotecaController = new BibliotecaController(view, books, new ArrayList<String>());
        Mockito.when(view.takeInput()).thenReturn("1");
        bibliotecaController.run();

        verify(view).displayOutput("##### MAIN MENU #####");
        verify(view).displayOutput("1. show list of books");
    }

    @Test
    public void canSelectOptionsFromMenu() {
        View view = mock(View.class);
        Library books =mock(Library.class);
        BibliotecaController bibliotecaController = new BibliotecaController(view, books, new ArrayList<String>());

        bibliotecaController.menuOptions("1");

        Mockito.verify(books).convertBookListToStringFormat(new ArrayList<String>(), view);
    }
}
