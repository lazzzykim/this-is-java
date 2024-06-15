package ch05.sec05;

public class LengthEx {
    public static void main(String[] args) {
        String ssn = "9411281231230";

        int length = ssn.length();

        if (length == 13) {
            System.out.println("자리수가 맞습니다");
        } else {
            System.out.println("자리수가 틀렸습니다");
        }
    }
}
