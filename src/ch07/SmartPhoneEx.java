package ch07;

public class SmartPhoneEx {
    public static void main(String[] args) {

        SmartPhone myPhone = new SmartPhone("아이폰", "블랙");

        System.out.println("모델: " + myPhone.model);
        System.out.println("컬러: " + myPhone.color);

        System.out.println("와이파이 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("네 말씀하세요");
        myPhone.sendVoice("잘못걸었음");
        myPhone.hangUp();

        myPhone.setWifi(true);
        myPhone.internet();
    }
}