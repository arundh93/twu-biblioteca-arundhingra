package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ViewInterface;


public class InvalidOption implements MenuOperation {

    private UnSuccessfulView unSuccessfulView;

    public InvalidOption(UnSuccessfulView unSuccessfulView) {

        this.unSuccessfulView = unSuccessfulView;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        unSuccessfulView.inValidOption();
        return viewInterface;
    }
}
