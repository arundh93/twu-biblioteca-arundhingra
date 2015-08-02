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

    public void displayListOfBooks(ArrayList<LibraryItem> books) {
        for (LibraryItem book : books) {
                displayOutput(book.toString());
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
        displayOutput("7. Quit\n");
        displayOutput("Enter an option (1/2/3/4/5/6/7)");

    }
}

