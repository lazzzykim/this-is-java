package ch08.sec08;

public class SmartTelevision implements RemoteControl, Searchable {

    @Override
    public void turnOn() {
        System.out.println("TV ON");
    }

    @Override
    public void turnOff() {
        System.out.println("TV OFF");
    }

    @Override
    public void search(String url) {
        System.out.println(url + " search");
    }
}
