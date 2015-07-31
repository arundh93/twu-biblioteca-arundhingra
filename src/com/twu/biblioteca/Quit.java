package com.twu.biblioteca;

public class Quit implements MenuOperation {

    @Override
    public void execute(Library library, View view) {
        System.exit(0);
    }
}
