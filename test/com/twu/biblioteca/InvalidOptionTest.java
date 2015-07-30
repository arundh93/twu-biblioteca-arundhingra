package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;


public class InvalidOptionTest {

    @Test
    public void canCheckForInvalidOption() {
        InvalidOption invalidOption = new InvalidOption();
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);

        invalidOption.execute(library, view);

        Mockito.verify(view).displayOutput("Invalid input!");
    }
}