package com.twu.biblioteca.menu;

import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.ViewInterface;


public class ListItem implements MenuOperation {

    private Library library;
    private ViewInterface viewInterface;
    private SuccessfulView successfulView;

    public ListItem(Library library, ViewInterface viewInterface, SuccessfulView successfulView) {
        this.library = library;
        this.viewInterface = viewInterface;
        this.successfulView = successfulView;
    }

    @Override
    public ViewInterface execute() {
        for (LibraryItem item : library.getAvailableItems()) {
            successfulView.printItem(item);
        }
        return viewInterface;
    }
}
