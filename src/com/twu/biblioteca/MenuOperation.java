package com.twu.biblioteca;

import java.util.ArrayList;

public interface MenuOperation {
    ArrayList<Book> execute(Library library, View view);
}
