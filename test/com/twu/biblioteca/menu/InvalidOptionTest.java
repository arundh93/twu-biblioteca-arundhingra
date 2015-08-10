package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;


public class InvalidOptionTest {

    @Test
    public void canCheckForInvalidOption() {
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        View view = Mockito.mock(View.class);
        InvalidOption invalidOption = new InvalidOption(view);
        invalidOption.execute(viewInterface);

        Mockito.verify(view).inValidOption();
    }
}