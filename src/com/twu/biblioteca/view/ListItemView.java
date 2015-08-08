package com.twu.biblioteca.view;

import com.twu.biblioteca.libraryitem.LibraryItem;

import java.util.ArrayList;

public class ListItemView {

    public void render(ArrayList<LibraryItem> checkedOutItems, ArrayList<String> ownershipDetails) {
        for(int i = 0;i < checkedOutItems.size(); i++) {
            System.out.println((checkedOutItems.get(i) + " " + ownershipDetails.get(i)));
        }
    }
}
