package ch06.sec06.ex01;

public class CarEx {
    public static void main(String[] args) {

        Car mycar = new Car();

        System.out.println("모델명" + mycar.model);
        System.out.println("시동여부" + mycar.start);
        System.out.println("현재속도" + mycar.speed);
    }
}
