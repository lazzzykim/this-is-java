package ch08.sec07;

public class ServiceEx {
    public static void main(String[] args) {

        // 인터페이스 변수 선언과 인스턴스 생성
        Service service = new ServiceImpl();

        service.defaultMethod1();
        System.out.println();
        service.defaultMethod2();
        System.out.println();

        // static method 호출
        Service.staticMethod1();
        System.out.println();
        Service.staticMethod2();
        System.out.println();
    }
}
