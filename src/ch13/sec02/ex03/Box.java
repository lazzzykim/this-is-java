package ch13.sec02.ex03;

public class Box<T> {
    public T content;

    // Box 내용물 비교
    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}
