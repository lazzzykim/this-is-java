package ch05.ex;

public class Num2 {
    public static void main(String[] args) {

        int[] array = {1, 5, 3, 8, 2};

        int maxNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxNum < array[i]) {
                maxNum = array[i];
            }
        }
        System.out.println(maxNum);
    }
}
