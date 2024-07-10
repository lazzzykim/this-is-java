package ch13.sec02.ex01;

public class GenericEx {
    public static void main(String[] args) {

        Product<Tv, String> product1 = new Product<>();

        //Setter 매개값은 반드시 tv와 string을 제공
        product1.setKind(new Tv());
        product1.setModel("스마트tv");

        //Getter 리턴값은 tv와 string이 됨
        Tv tv = product1.getKind();
        String tvModel = product1.getModel();

        //K는 Car로 대체, M은 String 대체
        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("SUV Car");

        Car car = product2.getKind();
        String carModel = product2.getModel();
    }
}
