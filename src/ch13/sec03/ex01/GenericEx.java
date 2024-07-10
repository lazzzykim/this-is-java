package ch13.sec03.ex01;

public class GenericEx {
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<T>();
        box.set(t);
        return box;
    }

    public static void main(String[] args) {
        Box<Integer> box1 = boxing(100);
        int value = box1.get();
        System.out.println(value);

        Box<String> box2 = boxing("바보");
        String stringValue = box2.get();
        System.out.println(stringValue);
    }
}
