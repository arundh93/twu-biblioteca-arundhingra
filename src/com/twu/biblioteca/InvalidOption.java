package com.twu.biblioteca;

public class InvalidOption implements MenuOperation {

    @Override
    public void execute(View view) {
        view.displayOutput("Invalid input!");
    }
}
