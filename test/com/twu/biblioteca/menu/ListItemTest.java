package com.twu.biblioteca.menu;

import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.libraryitem.LibraryItem;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.SuccessfulView;
import com.twu.biblioteca.view.View;
import com.twu.biblioteca.view.ViewInterface;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;


public class ListItemTest {

    @Test
    public void canReturnListOfBooks() {
        Library library = Mockito.mock(Library.class);
        LibraryItem libraryItem = new Book("asd", "sdf", 1234);
        ViewInterface viewInterface = Mockito.mock(ViewInterface.class);
        SuccessfulView successfulView = Mockito.mock(SuccessfulView.class);
        ListItem listOfBooks = new ListItem(library, viewInterface, successfulView);
        ArrayList<LibraryItem> availableItems = new ArrayList<LibraryItem>();

        availableItems.add(new Book("asd", "sdf", 1234));
        Mockito.when(library.getAvailableItems()).thenReturn(availableItems);
        listOfBooks.execute();
        Mockito.verify(successfulView).printItem(libraryItem);
    }
}