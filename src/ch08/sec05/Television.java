package ch08.sec05;

import ch08.sec05.RemoteControl;

public class Television implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > MAX_VOL) {
            this.volume = MAX_VOL;
        } else if (volume < MIN_VOL) {
            this.volume = MIN_VOL;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 볼륨: " + this.volume);
    }

    @Override
    public void turnOff() {
        System.out.println(" TV를 종료합니다.");
    }
}
