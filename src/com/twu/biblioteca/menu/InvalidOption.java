package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.UnSuccessfulView;
import com.twu.biblioteca.view.ViewInterface;


public class InvalidOption implements MenuOperation {

    private ViewInterface viewInterface;
    private UnSuccessfulView unSuccessfulView;

    public InvalidOption(ViewInterface viewInterface, UnSuccessfulView unSuccessfulView) {

        this.viewInterface = viewInterface;
        this.unSuccessfulView = unSuccessfulView;
    }

    @Override
    public ViewInterface execute() {
        unSuccessfulView.inValidOption();
        return viewInterface;
    }
}
