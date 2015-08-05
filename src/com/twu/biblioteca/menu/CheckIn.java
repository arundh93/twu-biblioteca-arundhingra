package com.twu.biblioteca.menu;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckIn implements MenuOperation {

    private Library library;
    private Login login;

    public CheckIn(Library library, Login login) {
        this.library = library;
        this.login = login;
    }

    @Override
    public void execute(View view) {
        view.displayOutput("enter the name");
        String input = view.takeInput();
        if (library.returnLibraryItem(input, login)) {
            view.displayOutput("Thank you for returning!");
        }
        else {
            view.displayOutput("This does not belong to the library");
        }
    }
}
