package ch11.sec03.ex02;

public class ExceptionHandlingEx {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열인덱스 초과됨: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("실행에 문제가 있습니다.");
            }
        }
    }
}
