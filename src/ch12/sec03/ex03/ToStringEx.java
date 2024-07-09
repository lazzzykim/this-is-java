package ch12.sec03.ex03;

public class ToStringEx {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("애플", "아이폰15");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone);
    }
}
