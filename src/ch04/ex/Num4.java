package ch04.ex;

public class Num4 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("주사위를 굴립니다.");

            int num1 = (int) (Math.random() * 6) + 1;
            int num2 = (int) (Math.random() * 6) + 1;

            System.out.println("주사위의 값: " + num1 + " ," + num2);

            if (num1 + num2 == 5) {
                System.out.println("주사위 눈의 합이 5가 되어 종료합니다.");
                break;
            }
        }
    }
}
