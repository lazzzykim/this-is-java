package ch06.sec07.exam05;

public class CarEx {
    public static void main(String[] args) {

        Car car1 = new Car("자가용");
        System.out.println(car1.maxSpeed);
        System.out.println(car1.company);
        System.out.println(car1.model);

        Car car2 = new Car("자가용", "빨강");
        System.out.println(car2.company);
        System.out.println(car2.color);
        System.out.println(car2.model);
        System.out.println(car2.maxSpeed);

        Car car3 = new Car("택시", "검정", 200);
        System.out.println(car3.maxSpeed);
        System.out.println(car3.model);
    }
}
