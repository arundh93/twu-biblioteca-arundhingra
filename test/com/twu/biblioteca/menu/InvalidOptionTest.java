package com.twu.biblioteca.menu;

import com.twu.biblioteca.menu.InvalidOption;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;


public class InvalidOptionTest {

    @Test
    public void canCheckForInvalidOption() {
        InvalidOption invalidOption = new InvalidOption();
        View view = Mockito.mock(View.class);
        Library library = Mockito.mock(Library.class);

        invalidOption.execute(view);

        Mockito.verify(view).displayOutput("Invalid input!");
    }
}