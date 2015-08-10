package com.twu.biblioteca.model;

public class User {

    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private String userName;
    private String role;

    public User(String name, String email, String phoneNumber, String password, String userName, String role) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("%-25s %-25s %-25s", name, email, phoneNumber);
    }

    public String getRole() {
        return role;
    }

    public boolean verify(String name, String pass) {
        return userName.equals(name) && password.equals(pass);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (password != null ? !password.equals(user.password) : user.password != null) return false;
        return !(userName != null ? !userName.equals(user.userName) : user.userName != null);
    }

    @Override
    public int hashCode() {
        int result = password != null ? password.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }
}
