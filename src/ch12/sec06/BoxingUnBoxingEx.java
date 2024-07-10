package ch12.sec06;

public class BoxingUnBoxingEx {
    public static void main(String[] args) {

        //Boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());  // Integer 객체 내부 int값 리턴

        //UnBoxing
        int value = obj;
        System.out.println("value : " + value);

        //연산 시 unboxing
        int result = obj + 100;
        System.out.println("result : " + result);
    }
}
