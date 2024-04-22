package org.example;

public class User {
    private long id;
    private String name;
    // Other user properties and methods

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
