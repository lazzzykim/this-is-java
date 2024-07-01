package ch08.sec05;

public interface RemoteControl {

    int MAX_VOL = 10;
    int MIN_VOL = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리합니다.");
            //추상 메소드 호출하면서 상수 필드 사용
            setVolume(MIN_VOL);
        } else {
            System.out.println("무음 해제합니다.");
        }
    }
}
