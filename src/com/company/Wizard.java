package com.company;

public class Wizard extends Beginner {
    @Override
    public void hit() {
        super.hit();
        System.out.println("마법으로 없애버립니다");
    }
    protected void magicBolt() {
        System.out.println("에너지 볼트를 날립니다");
    }
}
