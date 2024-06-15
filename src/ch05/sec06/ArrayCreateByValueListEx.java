package ch05.sec06;

public class ArrayCreateByValueListEx {
    public static void main(String[] args) {
        // 배열 변수선언과 배열 생성
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        // 배열의 항목값 찾기
        System.out.println("season[0]: " + season[0]);
        System.out.println("season[1]: " + season[1]);
        System.out.println("season[2]: " + season[2]);
        System.out.println("season[3]: " + season[3]);

        season[1] = "여름";
        System.out.println("season[1]: " + season[1]);

        int[] scores = {83, 90, 87};

        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합: " + sum);
        double average = (double) sum / scores.length;
        System.out.println("평균:" + average);
    }
}
