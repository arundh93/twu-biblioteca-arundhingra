package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;


public class InvalidOptionTest {

    @Test
    public void canCheckForInvalidOption() {
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        UnSuccessfulView unSuccessfulView = Mockito.mock(UnSuccessfulView.class);
        InvalidOption invalidOption = new InvalidOption(unSuccessfulView);
        invalidOption.execute(viewInterface);

        Mockito.verify(unSuccessfulView).inValidOption();
    }
}