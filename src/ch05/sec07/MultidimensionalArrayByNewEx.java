package ch05.sec07;

public class MultidimensionalArrayByNewEx {
    public static void main(String[] args) {
        // 각 반의 학생수가 3명으로 동일할 경우
        int[][] mathScores = new int[2][3];
        // 배열 항목 초기값 출력
        for (int i = 0; i < mathScores.length; i++) {
            for (int j = 0; j < mathScores[i].length; j++) {

                System.out.println("mathScores[" + i + "][" + j + "]: " + mathScores[i][j]);
            }
        }

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;

        // 전체 학생의 평균 구하기

        int totalStudent = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent += mathScores[i].length; // 반의 학생 수 합산
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }
        double totalAvg = (double) totalMathSum / totalStudent;
        System.out.println("전체 학생의 평균 점수: " + totalAvg);
        System.out.println();
    }
}
