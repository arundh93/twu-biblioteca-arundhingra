package com.twu.biblioteca;

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

    public void displayListOfBooks(ArrayList<Book> books) {
        for (Book book : books) {
            if(book.isBookInLibrary())
                System.out.printf("%-25s %-25s %-25s\n", book.getTitle(), book.getAuthor(), Integer.toString(book.getPublicationYear()));
        }
    }

    public void displayMenu() {
        displayOutput("\n***** Main Menu *****");
        displayOutput("1. List Books");
        displayOutput("2. Checkout Book");
        displayOutput("3. Return book");
        displayOutput("4. Quit\n");
        displayOutput("Enter an option (1/2/3/4)");

    }
}

