package ch04.ex;

public class Num5 {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        for (int x = 0; x <= 10; x++) {
            for (int y = 0; y <= 10; y++) {
                if ((num1 * x) + (num2 * y) == 60) {
                    System.out.println(x + " ," + y);
                }
            }
        }
    }
}
