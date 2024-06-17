package ch05.sec09;

public class ArrayCopyByForEx {
    public static void main(String[] args) {
        //길이 3인 배열
        int[] oldIntArray = {1, 2, 3};

        int[] newIntArray = new int[5];

        for (int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }
    }
}
