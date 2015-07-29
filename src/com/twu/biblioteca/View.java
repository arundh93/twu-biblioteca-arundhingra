package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    private Scanner sc;

    public void displayWelcomeMessage() {
        displayOutput("***** Welcome To Biblioteca *****");
    }

    public void displayOutput(String output) {
        System.out.println(output);
    }

    public String takeInput() {
        sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void displayListOfBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.printf("%-25s %-25s %-25s\n", book.getTitle(), book.getAuthor(), Integer.toString(book.getPublicationYear()));
        }
    }

    public void displayMenu() {
        displayOutput("Main Menu");
        displayOutput("1. List Books");
    }
}

