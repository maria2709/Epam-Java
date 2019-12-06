package com.database;

public class User {
    private String name;
    private String email;
    public static int numberOfUsers;

  /*  public User() {
        int userId = ++numberOfUsers;
    }*/

    public User(String name, String email) {
    //    this();
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
