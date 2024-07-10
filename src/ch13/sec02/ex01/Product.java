package ch13.sec02.ex01;

public class Product<K, M> {

    private K kind;
    private M model; // 타입 파라미터를 필드 타입으로 사용

    public K getKind() {
        return this.kind;
    }

    public M getModel() {
        return this.model;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
