package com.company.week3;

public class James extends FirstPerson {
    private final String name = "James";

    @Override
    public void introduce() {
        System.out.println("Hello, I’m " + name + ".");
    }
}
