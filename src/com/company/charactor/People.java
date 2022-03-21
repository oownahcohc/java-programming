package com.company.charactor;

//1. 객체지향 프로그래밍의 시작
public class People {
    // 필드 구현
    public int age;
    private String name;
    private float height;

    // 메소드 구현 (게터, 세터 사용)
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

