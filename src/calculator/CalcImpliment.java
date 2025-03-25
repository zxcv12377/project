package calculator;

import java.util.Scanner;

public class CalcImpliment extends Calcbasic {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Calcbasic calcbasic = new Calcbasic();

        System.out.print("첫번째 숫자 입력 >> ");
        calcbasic.fnum = Integer.parseInt(sc.nextLine());

        System.out.print("연산자 입력 >> ");
        calcbasic.op = sc.nextLine();

        System.out.print("세번째 숫자 입력 >> ");
        calcbasic.lnum = Integer.parseInt(sc.nextLine());

        boolean run = true;
        while (run) {

            switch (calcbasic.op) {
                case "+":
                    calcbasic.add();
                    System.out.printf("%d + %d = %d", calcbasic.fnum, calcbasic.lnum, calcbasic.empnum);
                    run = false;
                    break;
                case "-":
                    calcbasic.subtract();
                    System.out.printf("%d - %d = %d", calcbasic.fnum, calcbasic.lnum, calcbasic.empnum);
                    run = false;
                    break;
                case "*":
                    calcbasic.multiply();
                    System.out.printf("%d * %d = %d", calcbasic.fnum, calcbasic.lnum, calcbasic.empnum);
                    run = false;
                    break;
                case "/":
                    calcbasic.divide();
                    System.out.printf("%d / %d = %d", calcbasic.fnum, calcbasic.lnum, calcbasic.empnum);
                    run = false;
                    break;
                default:
                    System.out.println("잘못된 수치 입력");
                    run = false;
                    break;
            }

        }
        sc.close();
    }
}
