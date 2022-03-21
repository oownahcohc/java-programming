package com.company.charactor;

public class Warrior extends Beginner {
    @Override
    public void hit() {
        super.hit();
        System.out.println("발로 찹니다");
    }

    protected void cut() {
        System.out.println("칼로 야무지게 베어버립니다");
    }
}
