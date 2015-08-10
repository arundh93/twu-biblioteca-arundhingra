package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.*;


public class CheckOut implements MenuOperation {

    private Library library;
    private Login login;
    private View view;
    private final String item;

    public CheckOut(Library library, Login login, View view, String item) {
        this.library = library;
        this.login = login;
        this.view = view;
        this.item = item;
    }

    public ViewInterface execute(ViewInterface viewInterface) {
        String input = view.takeInputOfItem(item);
        if (library.checkOutLibraryItem(input, login)) {
            view.showCheckOutMessage(item);
        } else {
            view.showUnsuccessfullCheckOutMessage(item);
        }
        return viewInterface;
    }
}
