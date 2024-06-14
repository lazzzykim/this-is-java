package ch04.sec03;

public class SwitchExpressionEx {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반 회원입니다.");
            }
            default -> System.out.println("손님 입니다."); // 실행문이 하나일 경우 중괄호 생략가능

        }
    }
}

