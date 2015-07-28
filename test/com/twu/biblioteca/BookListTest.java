package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class BookListTest {

    @Test
    public void canReturnBookList() {
        Book book1 = new Book("only time will tell");
        Book book2 = new Book("sins of a father");
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        BookList bookList = new BookList(books);

        assertEquals(books, bookList.getBookList());
    }
}
