package com.company.charactor;

public class Beginner {
    public int currentBlood;

    public void getCurrentBlood() {
        System.out.println("내 피는 현재 " + this.currentBlood + "입니다");
    }

    public void setCurrentBlood(int currentBlood) {
        this.currentBlood = currentBlood;
    }

    public void hit() {
        System.out.println("주먹으로 때립니다.");
    }

    public void drinkPotion(String potion) {
        this.startHeal();
        int myBlood = switch (potion) {
            case "빨간포션" -> this.currentBlood + 100;
            case "주황포션" -> this.currentBlood + 50;
            default -> throw new IllegalStateException("Unexpected value: " + potion);
        };
        this.setCurrentBlood(myBlood);
        System.out.println(potion + "을 마십니다");
    }

    protected void startHeal() {
        System.out.println("치료를 시작합니다");
    }
}
