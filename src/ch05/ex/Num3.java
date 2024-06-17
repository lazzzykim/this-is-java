package ch05.ex;

import java.util.Scanner;

public class Num3 {
    public static void main(String[] args) {

        boolean run = true;
        int studentNum = 0;
        int[] scores = null;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("---------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("---------------------------------------------------");

            int selectNum = scanner.nextInt();

            if (selectNum == 1) {
                System.out.println("학생수 >");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            } else if (selectNum == 2) {
                System.out.println("점수 입력 >");
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = scanner.nextInt();
                    System.out.println("입력한 점수는 : " + scores[i]);
                }
            } else if (selectNum == 3) {
                System.out.println("점수 리스트");
                for (int i = 0; i < scores.length; i++) {
                    System.out.print(scores[i] + " ");
                    System.out.println();
                }
            } else if (selectNum == 4) {
                System.out.println("분석");
                int maxScore = 0;
                int sumScore = 0;
                for (int i = 0; i < scores.length; i++) {
                    if (maxScore < scores[i]) {
                        maxScore = scores[i];
                    }
                    sumScore += scores[i];
                }
                double avg = (double) sumScore / scores.length;

                System.out.println("최고점수 :" + maxScore);
                System.out.println("평균점수 :" + avg);
            } else {
                System.out.println("종료합니다.");
                run = false;
            }
        }
    }
}
