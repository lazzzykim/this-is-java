package ch08.sec06;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
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
    public void turnOn() {
        System.out.println("오디오를 켭니다.");

    }

    private int memoryVolume;

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음처리 합니다.");
            setVolume(RemoteControl.MIN_VOL);
        } else {
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume); // 원래 볼륨으로 복원
        }
    }
}
