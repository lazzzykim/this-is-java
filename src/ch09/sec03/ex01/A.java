package ch09.sec03.ex01;

public class A {
    // static member class
    static class B {
    }

    B field1 = new B();

    // 정적 필드값으로 객체 대입

    static B field2 = new B();

    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method1() {
        B b = new B();
    }

    // 정적 메소드
    static void method2() {
        B b = new B();
    }
}
