package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.ListItemView;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.ViewInterface;


public class ListCheckedOutItem implements MenuOperation {
    private final Library library;
    private ListItemView listItemView;
    private ViewInterface viewInterface;

    public ListCheckedOutItem(Library library, ListItemView listItemView, ViewInterface viewInterface) {
        this.library = library;
        this.listItemView = listItemView;
        this.viewInterface = viewInterface;
    }

    @Override
    public ViewInterface execute() {
        listItemView.render(library.getCheckedOutItems(), library.getOwnershipDetails());
        return viewInterface;
    }
}
