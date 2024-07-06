package ch09.sec07.ex02;

public class Home {

    private RemoteControl rc = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV ON");
        }

        @Override
        public void turnOff() {
            System.out.println("TV OFF");
        }
    };

    public void use1() {
        rc.turnOn();
        rc.turnOff();
    }

    public void use2() {
        //로컬 변수에 익명 구현객체 대입
        RemoteControl rc = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("에어컨 ON");
            }

            @Override
            public void turnOff() {
                System.out.println("에어컨 OFF");
            }
        };
        rc.turnOn();
        rc.turnOff();
    }

    public void use3(RemoteControl rc) {
        rc.turnOn();
        rc.turnOff();
    }
}
