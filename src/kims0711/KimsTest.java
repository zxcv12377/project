package kims0711;

import java.util.Scanner;

public class KimsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하시오 >> ");

        String input = sc.nextLine();
        System.out.println("입력한 숫자 : " + input);
    }
}