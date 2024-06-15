package ch05.sec06;

public class MultidimensionalArrayByValueListEx {
    public static void main(String[] args) {
        // 2차원 배열 생성
        int[][] scores = {
                {80, 90, 96},
                {76, 88}
        };

        // 배열의 길이
        System.out.println("1차원 배열의 길이 (반의 수) : " + scores.length);
        System.out.println("2차원 배열 길이 (첫번째 반의 학생 수 : " + scores[0].length);
        System.out.println("2차원 배열 길이 (두번째 반의 학생 수 : " + scores[1].length);

        // 첫번째 반의 세 번째 학생의 점수
        System.out.println("socres[0][2]: " + scores[0][2]);
        // 두번째 반의 두번째 학생의 점수
        System.out.println("scores[1][1]: " + scores[1][1]);

        // 첫번째 반의 평균구하기
        int class1Sum = 0;
        for (int j = 0; j < scores[0].length; j++) {
            class1Sum += scores[0][j];
        }
        double class1avg = (double) class1Sum / scores[0].length;
        System.out.println(class1avg);

        int class2Sum = 0;
        for (int i = 0; i < scores[1].length; i++) {
            class2Sum += scores[1][i];
        }
        double class2avg = (double) class2Sum / scores[1].length;
        System.out.println(class2avg);

        int totalStudent = 0;
        int totalClassSum = 0;
        for (int i = 0; i < scores.length; i++) {
            totalStudent += scores[i].length;
            for (int j = 0; j < scores[i].length; j++) {
                totalClassSum += scores[i][j];

            }
        }
        double average = (double) totalClassSum / totalStudent;
        System.out.println(average);
        System.out.println(totalClassSum);
    }
}
