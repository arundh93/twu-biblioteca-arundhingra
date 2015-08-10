package com.twu.biblioteca.menu;

import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;


public class ListItem implements MenuOperation {

    private Library library;
    private View view;

    public ListItem(Library library, View view) {
        this.library = library;
        this.view = view;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        for (LibraryItem item : library.getAvailableItems()) {
            view.printItem(item);
        }
        return viewInterface;
    }
}
