package ch09.sec02.ex01;

public class A {
    //인스턴스 멤버 클래스
    class B {
    }

    // 인스턴스 필드값으로 B 객체 대입
    B field = new B();

    A() {
        B b = new B();
    }

    // 인스턴스 메소드
    void method() {
        B b = new B();
    }
}
