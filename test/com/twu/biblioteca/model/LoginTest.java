package com.twu.biblioteca.model;

import com.twu.biblioteca.test.User;
import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class LoginTest {

    @Test
    public void canSetCurrentUser() {
        ArrayList<User> userList = new ArrayList<User>();
        userList.add(new User("asd", "qwe", "dfg", "213", "123-4564", "user"));
        Login login = new Login(userList);

        assertEquals(true, login.setCurrentUser("123-4564", "213"));
    }
}
