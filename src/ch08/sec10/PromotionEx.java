package ch08.sec10;

public class PromotionEx {
    public static void main(String[] args) {
        //구현객체 생성
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a;

        a = b ;
        a = c ;
        a = d ;
        a = e ; // 자동 타입변환
    }
}
