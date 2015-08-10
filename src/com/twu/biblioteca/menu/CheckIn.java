package com.twu.biblioteca.menu;

import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.model.Login;
import com.twu.biblioteca.view.*;


public class CheckIn implements MenuOperation {

    private Library library;
    private Login login;
    private View view;
    private String item;

    public CheckIn(Library library, Login login, View view, String item) {
        this.library = library;
        this.login = login;
        this.view = view;
        this.item = item;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        String input = view.takeInputOfItem(item);
        if (library.returnLibraryItem(input, login)) {
            view.showCheckInMessage(item);
        } else {
            view.showUnsuccessfullCheckInMessage(item);
        }
        return viewInterface;
    }
}
