package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.View;

public class Quit implements MenuOperation {

    @Override
    public void execute(View view) {
        System.exit(0);
    }
}
