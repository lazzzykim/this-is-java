package ch04.ex;

public class Num3 {
    public static void main(String[] args) {
//
//        int sum = 0;
//
//        for (int i = 3; i <= 100; i += 3) {
//            sum += i;
//        }
//        System.out.println(sum);
//    }
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
