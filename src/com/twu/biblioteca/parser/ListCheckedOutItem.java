package com.twu.biblioteca.parser;

import com.twu.biblioteca.Login;
import com.twu.biblioteca.menu.MenuOperation;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;

public class ListCheckedOutItem implements MenuOperation {
    private final Library library;

    public ListCheckedOutItem(Library library) {
        this.library = library;
    }

    @Override
    public void execute(View view) {
        view.displayCheckoutList(library.getCheckedOutItems(), library.getOwnershipDetails());
    }
}
