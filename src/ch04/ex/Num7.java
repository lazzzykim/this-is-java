package ch04.ex;

import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean run = true;

        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("--------------------------------");
            System.out.print("선택> ");

            String num = scanner.nextLine();

            switch (num) {
                case "1": {
                    System.out.print("입금액>");
                    int deposit = scanner.nextInt();
                    total += deposit;
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("출금액>");

                    int withDraw = scanner.nextInt();
                    total -= withDraw;
                    scanner.nextLine();
                    break;
                }
                case "3": {
                    System.out.println("잔고: " + total);
                    break;
                }
                case "4": {
                    System.out.println(" 프로그램 종료");
                    run = false;
                    break;
                }
                default: {
                    System.out.println("잘못된 선택입니다. 다시 시도해주세요.");
                    break;
                }
            }
        }
    }
}