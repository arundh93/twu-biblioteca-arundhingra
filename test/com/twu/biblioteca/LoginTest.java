package com.twu.biblioteca;

import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LoginTest {

    @Test
    public void canSetCurrentUser() {
        ArrayList issuedBooks = Mockito.mock(ArrayList.class);
        ArrayList issuedMovies = Mockito.mock(ArrayList.class);
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("asd", "qwe", "dfg", issuedBooks, issuedMovies, "213", "123-4564"));
        Login login = new Login(userList);

        assertEquals(true, login.setCurrentUser("123-4564", "213"));
    }
}
