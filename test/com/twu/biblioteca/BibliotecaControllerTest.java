package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaControllerTest {

    @Test
    public void canDisplayWelcomeMessage() {
        View view = mock(View.class);
        Library books =mock(Library.class);
        BibliotecaController bibliotecaController = new BibliotecaController(view, books, new ArrayList<String>());

        bibliotecaController.start();

        verify(view).displayWelcomeMessage();
    }
}
