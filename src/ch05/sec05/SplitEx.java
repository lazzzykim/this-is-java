package ch05.sec05;

public class SplitEx {
    public static void main(String[] args) {

        String board = "1,자바 학습, 참조 타입을 학습합니다., 김성현";

        // 문자열 분리
        String[] tokens = board.split(",");

        // 인덱스별로 읽기
        System.out.println("번호: " + tokens[0]);
        System.out.println("번호: " + tokens[1]);
        System.out.println("번호: " + tokens[2]);
        System.out.println("번호: " + tokens[3]);

        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
