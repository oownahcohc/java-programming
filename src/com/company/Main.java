package com.company;

//import com.company.abstractClass.Animal;
import com.company.week3.James;
import com.company.week3.PersonInterface;
import com.company.week3.Sam;
import com.company.week3.carFactory.*;

import java.io.FileInputStream;
import java.util.Scanner;


// Week3
public class Main {
    public static void main(String[] args) {
        PersonInterface personInterface;

        com.company.week3.FirstPerson firstPerson = new com.company.week3.FirstPerson();
        James james = new James();
        Sam sam = new Sam();

        personInterface = firstPerson;
        personInterface.introduce();
        personInterface.eat();
        personInterface.wakeup();
        personInterface.walk();
        personInterface.sleep();
        System.out.println("=============");
        personInterface = james;
        personInterface.introduce();
        personInterface.eat();
        personInterface.wakeup();
        personInterface.walk();
        personInterface.sleep();
        System.out.println("=============");
        personInterface = sam;
        personInterface.introduce();
        personInterface.eat();
        personInterface.wakeup();
        personInterface.walk();
        personInterface.sleep();
        System.out.println("=============");

        try {
            FileInputStream in = new FileInputStream("src/class_setting.txt");
            Scanner aScan = new Scanner(in);
            String className = aScan.nextLine();
            System.out.println(className); // 설정파일에서 기록한 클래스 이름 확인
            aScan.close();
            in.close();
            Class<?> aClass = Class.forName(className);
            FirstPerson firstPerson1 = (FirstPerson) aClass.getDeclaredConstructor().newInstance();
            firstPerson1.introduce();
            firstPerson1.eat();
            firstPerson1.wakeUp();
            firstPerson1.walk();
            firstPerson1.sleep();
        } catch(Exception e) {
            e.printStackTrace(); // 예외 발생 시 그 내용 확인
        }


        튜브 최고급_튜브 = new 튜브();
        휠 장인이_만든_휠 = new 휠();
        타이어 금호_타이어 = new 타이어(최고급_튜브); // 타이어 <- 튜브
        바퀴 비싼_바퀴 = new 바퀴(금호_타이어, 장인이_만든_휠); // 바퀴 <- 휠, 타이어 <- 튜브
        몸통 고급진_몸통 = new 몸통();
        자동차 벤틀리 = new 자동차(비싼_바퀴, 고급진_몸통); // 자동차 <- 몸통, 바퀴 <- 휠, 타이어 <- 튜브
    }
}



// Week2
//public class Main {
//    public static void main(String[] args) {
//        // (1) 클래스를 만들고 해당 클래스의 인스턴스를 만들어보세요.
//        People person1 = new People();
//        person1.setAge(25);
//        person1.setName("홍길동");
//        person1.setHeight(180.3F);
//
//        int age = person1.getAge();
//        String name = person1.getName();
//        float height = person1.getHeight();
//
//        System.out.println("안녕하세요 저는 " + age + "살 " + name + "이고, 키는 " + height + "입니다.");
//
//
//        // 2. 클래스의 상속관계 이해
//        //(1) 부모클래스와 자식클래스를 만들어봅니다. 자식 클래스는 2개 이상 만듭니다.
//        //- 필드와 메소드를 구현하되, 그 중 일부는 접근제한자(private, protected, public) 를 사용해 봅니다.
//        //(2) 부모클래스와 자식클래스의 인스턴스를 생성하고 각 인스턴스에 대하여 소속 클래스에서 정의된 필드와 메소드를 사용해봅니다. 특히 자식 클래스에서 부모 클래스의 메소드를 오버라이딩해서 구현해 봅니다.
//        Beginner first = new Beginner();
//        first.setCurrentBlood(100);
//        first.getCurrentBlood();
//        first.hit();
//        first.drinkPotion("빨간포션");
//        first.getCurrentBlood();
//        System.out.println("======================");
//
//        Warrior second = new Warrior();
//        second.setCurrentBlood(200);
//        second.getCurrentBlood();
//        second.hit();
//        second.cut();
//        second.drinkPotion("주황포션");
//        second.getCurrentBlood();
//        System.out.println("======================");
//
//
//        Wizard third = new Wizard();
//        third.setCurrentBlood(250);
//        third.getCurrentBlood();
//        third.hit();
//        third.magicBolt();
//        third.drinkPotion("빨간포션");
//        third.getCurrentBlood();
//        System.out.println("======================");
//
//        //(3) 부모클래스 변수에 자식클래스의 인스턴스를 대입하는 다형성을 체험해봅니다.
//        Beginner firstBeginner = new Warrior();
//        firstBeginner.hit();
//        firstBeginner.setCurrentBlood(50);
//        Beginner secondBeginner = new Wizard();
//        secondBeginner.hit();
//        secondBeginner.setCurrentBlood(200);
//
//
//        Dog dog = new Dog();
//        dog.name = "흰둥이";
//        dog.age = 6;
//        dog.introduce();
//        dog.bark();
//
//        Cat cat = new Cat();
//        cat.name = "나비";
//        cat.age = 5;
//        cat.introduce();
//        cat.bark();
//
//
//
//        // 4. 인터페이스 사용
//        // (1) 인터페이스를 정의하고 이를 구현하는 클래스를 만듭니다.
//        // (2) 위 클래스의 인스턴스를 만들고 인터페이스에서 정의한 메소드를 호출해 보세요.
//        SearchStratagyAll searchStratagyAll = new SearchStratagyAll();
//        SearchStratagyImage searchStratagyImage = new SearchStratagyImage();
//        SearchStratagyMap searchStratagyMap = new SearchStratagyMap();
//        SearchStratagyNews searchStratagyNews = new SearchStratagyNews();
//
//        searchStratagyAll.search();
//        searchStratagyImage.search();
//        searchStratagyMap.search();
//        searchStratagyNews.search();
//
//        //5. 정적 필드와 정적 메소드의 사용
//        //(1) 정적 필드와 정적 메소드를 사용하는 클래스를 만듭니다. 위 문제(1~4)들에서 구현한 클래스들 중 하나를 가져와서 변형해서 사용해도 됩니다.
//        //(2) 정적 필드에 접근하고 정적 메소드를 호출해 봅니다. 이 경우 해당 클래스에 대한 인스턴스를 만들 필요는 없습니다. 인스턴스 생성은 오직 인스턴스 필드와 인스턴스 메소드를 사용할 때만 필요합니다.
//        PeopleStatic.breath();
//        System.out.println(PeopleStatic.armNumber);
//        PeopleStatic peopleStatic = new PeopleStatic(24, "임꺽정",193.7F);
//        int personAge = peopleStatic.getAge();
//        String personName = peopleStatic.getName();
//        float personHeight = peopleStatic.getHeight();
//        System.out.println("안녕 나는 " + personName + "이고, 나이는" + personAge + "살, " + "키는 " + personHeight + "이야");
//    }
//}





// Week 1
//public class Main {
//    public static void main(String[] args) {
//        // 상수(단순 숫자/문자 표현 및 final 키워드 모두 사용)
//        // 변수
//        // 출력문(System.out.println 또는 System.out.printf 모두 가능)
//        System.out.println("Hello World!! Welcome to Java Programing");
//        final int firstNum = 12;
//        final int secondNum = 30;
//        System.out.println(firstNum + secondNum);
//        System.out.println(firstNum - secondNum);
//        // float
//        float floatNum1 = 15.5F;
//        float floatNum2 = 24.9F;
//        System.out.println(floatNum1 * floatNum2);
//        System.out.println(floatNum1 / floatNum2);
//
//        // string
//        String sayHello = "안녕하세요";
//        String introduce = "제 이름은 조찬우입니다.";
//        System.out.println("Message: " + sayHello + " " + introduce);
//        // 조건문(if문, switch 문 모두 사용)
//        boolean company = true;
//        if (company == true) {
//            final String message = "축하합니다. 직장이 있으신요!";
//            System.out.println(message);
//        } else {
//            final  String message = "아쉽지만 구인구직을 계속 하셔야겠어요!";
//            System.out.println(message);
//        }
//
//        double myMoney = 2000;
//        boolean isCard = true;
//        if (myMoney>=3000 || isCard) {
//            System.out.println("택시를 타고 갈 수 있겠네요!");
//        } else {
//            System.out.println("포기하고 걸어가세요");
//        }
//
//        // switch 문
//        String social = "애플";
//        String message = switch (social) {
//            case "네이버" -> "네이버로 로그인합니다";
//            case "카카오" -> "카카오로 로그인합니다";
//            case "애플" -> "애플로 로그인합니다";
//            default -> throw new IllegalStateException("Unexpected value: " + social);
//        };
//        System.out.println(message);
//
//
//
//        // 반복문(for 문, while 문 모두 사용)
//        // for 문
//        int[] score = {90, 25, 67, 45, 80};
//        for(int i = 0; i < score.length; i++) {
//            if (score[i] < 60) {
//                continue;
//            }
//            System.out.println((i+1)+"번 학생 축하합니다. 합격입니다.");
//        }
//
//        // while 문
//        int coffee = 10;
//        int money = 4500;
//        String coffeeName = "아메리카노";
//        while (money > 0) {
//            System.out.println("돈을 받았으니"+ coffeeName + "를 줍니다.");
//            coffee--;
//            System.out.println("남은 커피의 양은 " + coffee + "입니다.");
//            if (coffee == 0) {
//                System.out.println("커피가 다 떨어졌습니다. 판매를 중지합니다.");
//                break;
//            }
//        }
//
//         // 예외처리(try ... catch 문은 반드시 사용, 이외의 확장내용은 자유)
//        try {
//            Exception error = new Exception("고의적 에러 발생");
//            throw error;
//        } catch (Exception e) {
//            System.out.println("Error Message : " + e.getMessage());
//        } System.out.println("프로그램 종료");
//
//        // null pointer exception
//        String str = null;
//        try {
//            if (str == null) {
//                Exception error = new Exception("null pointer exception");
//                throw error;
//            }
//        } catch (Exception e) {
//            System.out.println("Error Message : " + e.getMessage());
//        }
//        System.out.println("프로그램 종료");
//
//    }
//}


