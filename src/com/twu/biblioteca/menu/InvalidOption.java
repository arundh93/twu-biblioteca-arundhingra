package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.View;

public class InvalidOption implements MenuOperation {

    @Override
    public void execute(View view) {
        view.displayOutput("Invalid input!");
    }
}
