package ch08.sec02;

public interface RemoteControl {

    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상메소드
    public void turnOn();

    void turnOff();

    void setVolume(int volume);
}
