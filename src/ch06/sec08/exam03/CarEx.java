package ch06.sec08.exam03;

public class CarEx {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.setGas(5);

        if (myCar.isLeftGas()) {
            System.out.println("출발~");
            myCar.run();
        }

        System.out.println("가스를 주입하세요.");
    }
}
