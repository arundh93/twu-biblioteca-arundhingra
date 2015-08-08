package com.twu.biblioteca.view;

import com.twu.biblioteca.libraryitem.LibraryItem;

import java.util.ArrayList;

public class ListItemView {

    private View view;

    public ListItemView(View view) {

        this.view = view;
    }

    public void render(ArrayList<LibraryItem> checkedOutItems, ArrayList<String> ownershipDetails) {
        for(int i = 0;i < checkedOutItems.size(); i++) {
            view.displayOutput((checkedOutItems.get(i) + " " + ownershipDetails.get(i)));
        }
    }
}
