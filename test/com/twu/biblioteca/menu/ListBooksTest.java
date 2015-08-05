package com.twu.biblioteca.menu;

import com.twu.biblioteca.libraryitem.Book;
import com.twu.biblioteca.model.Library;
import com.twu.biblioteca.view.View;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;


public class ListBooksTest {

    @Test
    public void canReturnListOfBooks() {
        Library library = Mockito.mock(Library.class);
        ListBooks listOfBooks = new ListBooks(library);
        View view = Mockito.mock(View.class);
        ArrayList<Book> bookList= new ArrayList<Book>();
        Book book1 = new Book("only time will tell", "Jeffery Archer", 2000);
        Book book2 = new Book("sins of a father", "Jeffery Archer", 2000);
        bookList.add(book1);
        bookList.add(book2);
        listOfBooks.execute(view);

        Mockito.verify(view).displayList(library.getAvailableItems());
    }
}