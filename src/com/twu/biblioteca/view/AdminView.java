package com.twu.biblioteca.view;


import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.test.Controller;
import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.parser.Parser;

import java.util.Scanner;

public class AdminView implements ViewInterface {

    private Scanner scanner;
    private MenuOperation menuOperation;
    private Parser parser;
    private Login login;

    public AdminView(Scanner scanner, Parser parser) {

        this.scanner = scanner;
        this.parser = parser;
    }

    @Override
    public ViewInterface render(Controller controller) {
        System.out.println("\n***** Main Menu *****\n" +
                "1. List Books\n" +
                "2. List Movies\n" +
                "3. Checkout Book\n" +
                "4. Return book\n" +
                "5. Checkout Movie\n" +
                "6. Return Movie\n" +
                "7. Quit\n" +
                "8. List checked out book\n" +
                "9. List Checked out movie\n" +
                "10. Logout\n\n" +
                "Enter an option (1/2/3/4/5/6/7)");
        String input = scanner.nextLine();
        menuOperation = parser.parseInput(input, this);
        return menuOperation.execute();
    }
}

