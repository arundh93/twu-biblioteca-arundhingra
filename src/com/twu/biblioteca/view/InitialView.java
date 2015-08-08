package com.twu.biblioteca.view;

import java.util.Scanner;

public class InitialView {
    public boolean render() {
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
}
