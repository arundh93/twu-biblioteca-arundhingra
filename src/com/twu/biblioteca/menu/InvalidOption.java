package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;


public class InvalidOption implements MenuOperation {

    private View view;

    public InvalidOption(View view) {
        this.view = view;

    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        view.inValidOption();
        return viewInterface;
    }
}
