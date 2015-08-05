package com.twu.biblioteca.view;

import com.twu.biblioteca.libraryitem.LibraryItem;

import java.util.ArrayList;
import java.util.Scanner;


public class View {

    public void displayWelcomeMessage() {
        displayOutput("***** Welcome To Biblioteca *****");
    }

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

    public void displayMenu() {
        displayOutput("\n***** Main Menu *****");
        displayOutput("1. List Books");
        displayOutput("2. List Movies");
        displayOutput("3. Checkout Book");
        displayOutput("4. Return book");
        displayOutput("5. Checkout Movie");
        displayOutput("6. Return Movie");
        displayOutput("7. Quit");
        displayOutput("0. Show details");
        displayOutput("10. logout\n");
        displayOutput("Enter an option (1/2/3/4/5/6/7)");

    }

    public void displayAdminMenu() {
        displayOutput("\n***** Main Menu *****");
        displayOutput("1. List Books");
        displayOutput("2. List Movies");
        displayOutput("3. Checkout Book");
        displayOutput("4. Return book");
        displayOutput("5. Checkout Movie");
        displayOutput("6. Return Movie");
        displayOutput("7. Quit");
        displayOutput("8. List checked out book");
        displayOutput("9. List Checked out movie");
        displayOutput("10. Logout\n");
        displayOutput("Enter an option (1/2/3/4/5/6/7)");

    }

    public String[] askCredentials() {
        displayOutput("Enter username");
        String username = takeInput();
        displayOutput("Enter password");
        String password = takeInput();
        return new String[]{username, password};
    }

    public void displayCheckoutList (ArrayList<LibraryItem> items, ArrayList<String> ownership) {
        for(int i = 0;i < items.size(); i++) {
            displayOutput(items.get(i) + " " + ownership.get(i));
        }
    }
}

