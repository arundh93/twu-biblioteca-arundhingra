package com.twu.biblioteca.view;

import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.parser.Parser;


public class AdminView implements ViewInterface {

    private MenuOperation menuOperation;
    private Parser parser;
    private View view;

    public AdminView(Parser parser, View view) {

        this.parser = parser;
        this.view = view;
    }

    @Override
    public ViewInterface render(ViewInterface viewInterface) {
        view.displayOutput("\n***** Main Menu *****\n" +
                "1. List Books\n" +
                "2. List Movies\n" +
                "3. Checkout Book\n" +
                "4. Return  book\n" +
                "5. Checkout Movie\n" +
                "6. Return Movie\n" +
                "7. Quit\n" +
                "8. List checked out book\n" +
                "9. List Checked out movie\n" +
                "10. Logout\n\n" +
                "Enter an option (1/2/3/4/5/6/7)");
        String input = view.takeInput();
        menuOperation = parser.parseInput(input);
        return menuOperation.execute(this);
    }
}

