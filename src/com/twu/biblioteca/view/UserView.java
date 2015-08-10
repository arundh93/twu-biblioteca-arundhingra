package com.twu.biblioteca.view;

import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.parser.Parser;

import java.util.Scanner;

public class UserView implements ViewInterface {

    private Scanner scanner;
    private Parser parser;
    private MenuOperation menuOperation;

    public UserView(Scanner scanner, Parser parser) {

        this.scanner = scanner;
        this.parser = parser;
    }
    @Override
    public ViewInterface render(ViewInterface viewInterface) {
        System.out.println("\n***** Main Menu *****\n" +
                "0. Show details\n" +
                "1. List Books\n" +
                "2. List Movies\n" +
                "3. Checkout Book\n" +
                "4. Return book\n" +
                "5. Checkout Movie\n" +
                "6. Return Movie\n" +
                "7. Quit\n" +
                "10. logout\n" +
                "\n" +
                "Enter an option (1/2/3/4/5/6/7)\n");
        String input = scanner.nextLine();
        menuOperation = parser.parseInput(input);
        return menuOperation.execute(this);
    }
}
