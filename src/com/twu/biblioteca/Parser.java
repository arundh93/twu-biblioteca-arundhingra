package com.twu.biblioteca;

public class Parser {
    public MenuOperation parseInput(String input) {
        if(input.equals("1"))
            return new CheckOut();
        else if(input.equals("2"))
            return null;
        else
            return null;
    }
}
