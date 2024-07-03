package ch08.sec10.ex02;

public class CastingEx {
    public static void main(String[] args) {
        // 인터페이스 변수 선언, 구현객체 대입
        Vehicle vehicle = new Bus();

        vehicle.run();
//        vehicle.checkFare(); // 호출 불가능

        Bus bus = (Bus) vehicle;
        bus.checkFare(); //다운캐스팅
    }
}
