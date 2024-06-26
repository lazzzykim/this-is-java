package ch08.sec02;

public class RemoteControlEx {
    public static void main(String[] args) {

        RemoteControl rc;
        rc = new Television();

        rc.turnOn();
        rc.setVolume(50);
        rc.turnOff();

        rc = new Audio();

        rc.turnOn();
        System.out.println("리모콘 최대 볼륨: " + RemoteControl.MAX_VOLUME);
        System.out.println("리모콘 최소 볼륨: " + RemoteControl.MIN_VOLUME);
        rc.setVolume(4);
        rc.turnOff();
    }
}
