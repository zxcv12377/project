package sihyuntest;

import java.sql.Time;

public class TestEXE {
    public static void main(String[] args) {
        System.out.println("test입니다.");

        Test card = new Test();
        card.symbol = "Diamonds";
        card.number = 3;

        System.out.println(card.symbol+card.number);

        Test time = new Test();

        time.setHour(11);
        time.setMinute(60);
        time.setSecond(13.2f);

        System.out.println(time.getHour()+"시");
        System.out.println(time.getMinute()+"분");
        System.out.println(time.getSecond()+"초");        

    }
}
