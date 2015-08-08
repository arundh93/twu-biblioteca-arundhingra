package com.twu.biblioteca.menu;

import com.twu.biblioteca.menu.InvalidOption;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;


public class InvalidOptionTest {

    @Test
    public void canCheckForInvalidOption() {
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        UnSuccessfulView unSuccessfulView = Mockito.mock(UnSuccessfulView.class);
        InvalidOption invalidOption = new InvalidOption(viewInterface, unSuccessfulView);
        invalidOption.execute();

        Mockito.verify(unSuccessfulView).inValidOption();
    }
}