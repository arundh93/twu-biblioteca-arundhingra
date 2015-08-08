package com.twu.biblioteca.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void canReturnItsInformation() {
        User user = new User("arun", "arun@xyz.com", "123456789", "123", "123-4567", "user");

        assertEquals("arun                      arun@xyz.com              123456789                ", user.toString());
    }

    @Test
    public void canBeVerifiedAsARegisteredUser() {
        User user1 = new User("arun", "arun@xyz.com", "123456789", "123", "123-4567", "user");

        assertEquals(true, user1.verify("123-4567", "123"));
    }
}
