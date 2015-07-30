package com.twu.biblioteca;

import java.util.ArrayList;

public class Quit implements MenuOperation {

    @Override
    public void execute(Library library, View view) {
        System.exit(0);
    }
}
