package ch06.sec07.exam02;

public class KoreanEx {
    public static void main(String[] args) {

        Korean k1 = new Korean("김성현", "941128-1234123");
        // Korean 객체 데이터 읽기
        System.out.println("k1.nation : " + k1.nation);
        System.out.println("k1.name : " + k1.name);
        System.out.println("k1.ssn : " + k1.ssn);
        System.out.println();

        // 또 다른 객체 생성
        Korean k2 = new Korean("김사랑", "180816-1231231");

        System.out.println("k2.nation : " + k2.nation);
        System.out.println("k2.name : " + k2.name);
        System.out.println("k2.ssn : " + k2.ssn);

    }
}
