package com.company.abstractClass;

public class Cat extends Animal {
    @Override
    public void introduce() {
        System.out.println("안녕 내 이름은 " + name + "이고, 나이는 " + age + "살인 고양이야.");
    }

    @Override
    public void bark() {
        System.out.println("야옹");
    }
}
