package com.twu.biblioteca.view;

import com.twu.biblioteca.libraryitem.LibraryItem;

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
}

