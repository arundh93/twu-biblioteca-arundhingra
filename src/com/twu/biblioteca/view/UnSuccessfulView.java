package com.twu.biblioteca.view;

public class UnSuccessfulView {

    public void showCheckOutMessage(String item) {
        System.out.println("Sorry! " + item + " not present");
    }

    public void showCheckInMessage(String item) {
        System.out.println("The " + item + " does not belong to the library");
    }

    public void inValidOption() {
        System.out.println("invalid option");
    }
}
