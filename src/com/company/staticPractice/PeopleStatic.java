package com.company.staticPractice;

public class PeopleStatic {
    private int age;
    private String name;
    private float height;

    public PeopleStatic(int age, String name, float height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    static public final int armNumber = 2;
    static public void breath() {
        System.out.println("사람은 숨을 쉽니다");
    }

    // getter 설정
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public float getHeight() {
        return height;
    }

    // setter 설정
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setHeight(float height) {
        this.height = height;
    }
}

