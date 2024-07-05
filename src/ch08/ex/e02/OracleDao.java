package ch08.ex.e02;

public class OracleDao implements DataAccessObject {
    @Override
    public void delete() {
        System.out.println("oracle db에서 삭제");
    }

    @Override
    public void update() {
        System.out.println("oracle db에서 수정");
    }

    @Override
    public void insert() {
        System.out.println("oracle db에 삽입");
    }

    @Override
    public void select() {
        System.out.println("oracle db에서 검색");
    }
}
