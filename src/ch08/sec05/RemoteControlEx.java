package ch08.sec05;

public class RemoteControlEx {
    public static void main(String[] args) {

        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);

        rc.setMute(true);
        rc.setMute(false);

        System.out.println();

        // Audio 객체를 생성하고 인터페이스 변수에 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(8);

        rc.setMute(true);
        rc.setMute(false);
    }
}
