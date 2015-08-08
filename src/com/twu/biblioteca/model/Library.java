package com.twu.biblioteca.model;

import com.twu.biblioteca.libraryitem.LibraryItem;

import java.util.ArrayList;


public class Library {
    private ArrayList<LibraryItem> availableList;
    private ArrayList<LibraryItem> checkOutList;
    private ArrayList<String> ownership;

    public Library(ArrayList<LibraryItem> availableList, ArrayList<LibraryItem> checkOutList, ArrayList<String> ownership) {
        this.availableList = availableList;
        this.checkOutList = checkOutList;
        this.ownership = ownership;
    }

    public ArrayList<LibraryItem> getAvailableItems() {
        return availableList;
    }

    public ArrayList<LibraryItem> getCheckedOutItems() {
        return checkOutList;
    }

    public boolean checkOutLibraryItem(String itemName, Login login) {
        if (isLibraryItemPresent(itemName, availableList)) {
            addToCheckOutList(itemName, login);
            return true;
        } else
            return false;
    }

    private void addToCheckOutList(String itemName, Login login) {
        checkOutList.add(getItemFromName(itemName, availableList));
        ownership.add(login.getCurrentUserName());
        availableList.remove(getItemFromName(itemName, availableList));
    }

    public boolean returnLibraryItem(String itemName, Login login) {
        if (isLibraryItemPresent(itemName, checkOutList)) {
            int index = checkOutList.indexOf(getItemFromName(itemName, checkOutList));
            if (login.getCurrentUserName().equals(ownership.get(index))) {
                addToAvailableList(itemName, login);
                return true;
            } else
                return false;
        } else
            return false;
    }

    private void addToAvailableList(String itemName, Login login) {
        availableList.add(getItemFromName(itemName, checkOutList));
        checkOutList.remove(getItemFromName(itemName, checkOutList));
        ownership.remove(login.getCurrentUserName());
    }

    private boolean isLibraryItemPresent(String name, ArrayList<LibraryItem> itemList) {

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

    public ArrayList<String> getOwnershipDetails() {
        return ownership;
    }
}
