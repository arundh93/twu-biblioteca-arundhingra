package com.twu.biblioteca.model;

import com.twu.biblioteca.libraryitem.LibraryItem;

import java.util.ArrayList;


public class Library {
    private ArrayList<LibraryItem> availableList;
    private ArrayList<LibraryItem> checkOutList;

    public Library(ArrayList<LibraryItem> availableList, ArrayList<LibraryItem> checkOutList) {
        this.availableList = availableList;
        this.checkOutList = checkOutList;
    }

    public ArrayList<LibraryItem> getAvailableItems() {
        return availableList;
    }

    public ArrayList<LibraryItem> getCheckedOutItems() {
        return checkOutList;
    }

    public boolean checkOutLibraryItem(String itemName) {
        if (isLibraryItemPresent(itemName, availableList)) {
            checkOutList.add(getItemFromName(itemName, availableList));
            availableList.remove(getItemFromName(itemName, availableList));
            return true;
        } else
            return false;
    }

    public boolean returnLibraryItem(String itemName) {
        if (isLibraryItemPresent(itemName, checkOutList)) {
            availableList.add(getItemFromName(itemName, checkOutList));
            checkOutList.remove(getItemFromName(itemName, checkOutList));
            return true;
        }
        else
            return false;
    }

    public boolean isLibraryItemPresent(String name, ArrayList<LibraryItem> itemList) {

        boolean test = false;
        for (LibraryItem item : itemList) {
            if (item.hasTitle(getItemFromName(name, itemList)))
                test = true;
        }
        return test;
    }


    public LibraryItem getItemFromName(String name, ArrayList<LibraryItem> itemList) {

        for (LibraryItem item : itemList) {
            if (item.getTitle().equals(name))
                return item;
        }
        return null;
    }

}
