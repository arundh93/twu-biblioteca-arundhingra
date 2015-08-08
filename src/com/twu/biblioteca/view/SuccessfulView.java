package com.twu.biblioteca.view;

import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.test.User;


public class SuccessfulView {

    public void showCheckOutMessage(String item) {
        System.out.println("Enjoy the " + item);
    }

    public void showCheckInMessage(String item) {
        System.out.println("Thank you for returning the " + item + "!");
    }

    public void printItem(LibraryItem item) {
        System.out.println(item);
    }

    public void printUserDetails(User currentUser) {
        System.out.println(currentUser);
    }
}
