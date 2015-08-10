package com.twu.biblioteca.view;

import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.test.User;

import java.util.ArrayList;
import java.util.Scanner;


public class View {


    public void displayOutput(String output) {
        System.out.println(output);
    }

    public String takeInput() {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void displayList(ArrayList<LibraryItem> items) {
        for (LibraryItem item : items) {
                displayOutput(item.toString());
        }
    }

    public void displayCheckoutList (ArrayList<LibraryItem> items, ArrayList<String> ownership) {
        for(int i = 0;i < items.size(); i++) {
            displayOutput(items.get(i) + " " + ownership.get(i));
        }
    }

    public boolean initialMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Login\n2. Quit");
        String choice = scanner.nextLine();
        if(choice.equals("2")){
            System.exit(0);
            return false;
        }
        else if(!choice.equals("1")) {
            System.out.println("invalid input");
            return false;
        }
        else
            return true;
    }

    public String takeInputOfItem(String item) {
        System.out.println("enter the name of " + item);
        return takeInput();
    }

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

    public void showUnsuccessfullCheckOutMessage(String item) {
        System.out.println("Sorry! " + item + " not present");
    }

    public void showUnsuccessfullCheckInMessage(String item) {
        System.out.println("The " + item + " does not belong to the library");
    }

    public void inValidOption() {
        System.out.println("invalid option");
    }

}

