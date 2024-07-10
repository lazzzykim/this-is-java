package ch12.sec03.ex05;

import lombok.Data;
import lombok.NonNull;

@Data
public class Member {
    private String id;
    @NonNull private String name;
    private int age;
}
