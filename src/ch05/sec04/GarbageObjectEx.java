package ch05.sec04;

public class GarbageObjectEx {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; // GC 작동

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null;
        System.out.println("kind2: " + kind2); // kind2가 여전히 참조하고 있기 때문에 GC 작동하지 않음
    }
}
