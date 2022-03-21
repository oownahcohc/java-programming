package com.company.week3;

public class Sam implements PersonInterface {
    private final String name = "Sam";


    @Override
    public void introduce() {
        System.out.println("Hello I'm " + name + ".");
    }

    @Override
    public void wakeup() {
        System.out.println(name + "은 자리에서 일어납니다.");
    }

    @Override
    public void eat() {
        System.out.println(name + "은 라면을 먹습니다.");
    }

    @Override
    public void walk() {
        System.out.println(name + "은 빗속을 걸어다닙니다.");
    }

    @Override
    public void sleep() {
        System.out.println(name + "은 22시에 잠을 잡니다.");
    }
}
