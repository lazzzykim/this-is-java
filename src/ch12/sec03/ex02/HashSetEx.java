package ch12.sec03.ex02;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();

        Student s1 = new Student(1, "김성현");
        hashSet.add(s1);
        System.out.println("저장된 객체수: " + hashSet.size());

        Student s2 = new Student(1, "김성현");
        hashSet.add(s2);
        System.out.println("저장된 객체수: " + hashSet.size());

        Student s3 = new Student(2, "김성현");
        hashSet.add(s3);
        System.out.println("저장된 객체수: " + hashSet.size());
    }
}
