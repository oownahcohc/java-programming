package com.company.abstractClass;

//3. 추상클래스 사용
//(1) 하나의 추상클래스를 만들고 이를 상속받는 2개 이상의 자식클래스를 만듭니다.
//(2) 부모클래스 변수에 자식클래스의 인스턴스를 대입해 사용하는 다형성을 체험해봅니다.
//
abstract class Animal {
    public String name;
    public int age;

    public void introduce() {}
    public void bark() {}
}
