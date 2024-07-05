package ch09.sec05.ex01;

public class A {
    int field1;

    void method1() {
    }

    static int field2;

    static void method2() {
    }

    class B {
        void method() {
            // A의 인스턴스 멤버 사용 가능
            field1 = 10;
            method1();
            field2 = 10;
            method2();
        }
    }

    static class C {
        void method() {
            // A의 인스턴스 멤버 사용
            // field1 = 10; // 불가
            // method1();  // 불가
            field2 = 10;
            method2(); //가능
        }
    }
}
