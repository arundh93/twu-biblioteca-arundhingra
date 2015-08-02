package com.twu.biblioteca;

public class Quit implements MenuOperation {

    @Override
    public void execute(View view) {
        System.exit(0);
    }
}
