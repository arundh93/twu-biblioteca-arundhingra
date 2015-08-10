package com.twu.biblioteca.menu;

import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;


public class ListItem implements MenuOperation {

    private Library library;
    private SuccessfulView successfulView;

    public ListItem(Library library, SuccessfulView successfulView) {
        this.library = library;
        this.successfulView = successfulView;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        for (LibraryItem item : library.getAvailableItems()) {
            successfulView.printItem(item);
        }
        return viewInterface;
    }
}
