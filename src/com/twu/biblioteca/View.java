package com.twu.biblioteca;

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
}

