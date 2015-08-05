package com.twu.biblioteca.menu;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class CheckOut implements MenuOperation {

    private Library library;
    private Login login;

    public CheckOut(Library library, Login login) {
        this.library = library;
        this.login = login;
    }

    public void execute(View view) {
        view.displayOutput("Enter the name");
        String bookName = view.takeInput();
        if (library.checkOutLibraryItem(bookName, login)) {
            view.displayOutput("Enjoy!\n");
        }
        else {
            view.displayOutput("Sorry! Item not available in the library");
        }
    }
}
