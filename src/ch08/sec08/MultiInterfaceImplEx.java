package ch08.sec08;

public class MultiInterfaceImplEx {
    public static void main(String[] args) {

        RemoteControl remote = new SmartTelevision();
        Searchable search = new SmartTelevision();
        remote.turnOn();
        remote.turnOff();

        search.search("www,naver.com");

    }
}
