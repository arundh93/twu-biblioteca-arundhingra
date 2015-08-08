package com.twu.biblioteca.view;

import java.util.Scanner;

public class ChoiceView {

    private Scanner scanner;

    public ChoiceView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String execute(String item) {
        System.out.println("enter the name of " + item);
        return getString();
    }

    private String getString() {
        return scanner.nextLine();
    }
}
