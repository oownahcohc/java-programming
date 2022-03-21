package com.company.week3;

public class FirstPerson implements PersonInterface {

    @Override
    public void wakeup() {
        System.out.println("자리에서 일어납니다.");
    }

    @Override
    public void eat() {
        System.out.println("맛있는 밥을 먹습니다.");
    }

    @Override
    public void walk() {
        System.out.println("집 앞 공원을 산책합니다.");
    }

    @Override
    public void sleep() {
        System.out.println("침대에 누워 잠을 잡니다.");
    }
}
