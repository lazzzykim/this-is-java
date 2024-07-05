package ch09.sec04.ex03;

public class A {

    public void method1(int arg) {  // final int arg
        // 로컬 변수
        int var = 1;  // final int var = 1;

        // 로컬 클래스
        class B {
            void method2() {
                System.out.println("arg: " + arg);
                System.out.println("var: " + var);

                //로컬 변수 수정
                //arg = 2; 불가
                //var = 2; 불가
            }
        }
        // 로컬 객체 생성
        B b = new B();
        b.method2();
    }
}
