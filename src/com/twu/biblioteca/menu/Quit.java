package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.ViewInterface;


public class Quit implements MenuOperation {

    @Override
    public ViewInterface execute() {
        System.exit(0);
        return null;
    }
}
