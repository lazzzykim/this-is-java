package ch09.sec03.ex02;

public class A {
    static class B {
        int field1 = 1;

        static int field2 = 2;

        B() {
            System.out.println("B 생성자 실행");
        }
        // 인스턴스 메소드
        void method1() {
            System.out.println("B-method1 run");
        }

        static void method2() {
            System.out.println("B-method2 run");
        }
    }
}
