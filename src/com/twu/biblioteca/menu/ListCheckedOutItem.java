package com.twu.biblioteca.menu;

import com.twu.biblioteca.view.ListItemView;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.ViewInterface;


public class ListCheckedOutItem implements MenuOperation {
    private final Library library;
    private ListItemView listItemView;

    public ListCheckedOutItem(Library library, ListItemView listItemView) {
        this.library = library;
        this.listItemView = listItemView;
    }

    @Override
    public ViewInterface execute(ViewInterface viewInterface) {
        listItemView.render(library.getCheckedOutItems(), library.getOwnershipDetails());
        return viewInterface;
    }
}
