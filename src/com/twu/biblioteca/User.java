package com.twu.biblioteca;

public class User {

    private final String name;
    private final String email;
    private final String phoneNumber;

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%-25s %-25s %-25s", name, email, phoneNumber);
    }
}
