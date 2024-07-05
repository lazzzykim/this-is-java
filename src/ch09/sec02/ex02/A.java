package ch09.sec02.ex02;

public class A {
    // instance member class

    class B {
        int field1 = 1;

        // static field ( java 17 )
        static int field2 = 2;

        // construct
        B() {
            System.out.println("B 생성자 실행");
        }

        // instance method
        void method1() {
            System.out.println("B-method 실행");
        }

        // static method (java 17)
        static void method2() {
            System.out.println("B-method2 실행");
        }
    }

    void useB() {
        B b = new B();
        System.out.println(b.field1);
        b.method1();
        // B 클래스 정적 멤버 사용

        System.out.println(B.field2);
        B.method2();
    }


}
