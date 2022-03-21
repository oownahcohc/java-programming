package com.company.week3;


public interface PersonInterface {
    public static final String spec = "포유류";

    default void introduce() {
        System.out.println("Hello, I'm human");
    }

    public void wakeup();
    public void eat();
    public void walk();
    public void sleep();
}
