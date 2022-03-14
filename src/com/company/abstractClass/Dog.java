package com.company.abstractClass;

public class Dog extends Animal{
    @Override
    public void introduce() {
        System.out.println("안녕 내 이름은 " + name + "이고, 나이는 " + age + "살 인 강아지야");
    }

    @Override
    public void bark() {
        System.out.println("멍멍");
    }
}
