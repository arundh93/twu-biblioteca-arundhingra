package com.twu.biblioteca;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BibliotecaControllerTest {

    @Test
    public void foo() {
        View view = mock(View.class);
        BibliotecaController bibliotecaController = new BibliotecaController(view);

        bibliotecaController.start();

        verify(view).displayWelcomeMessage();
    }
}
