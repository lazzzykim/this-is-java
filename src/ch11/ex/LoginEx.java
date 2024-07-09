package ch11.ex;

public class LoginEx {
    public static void main(String[] args) {
        try {
            login("white", "12345");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            login("blue", "54321");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void login(String id, String password) throws Exception {
        if (!id.equals("blue")) {
            throw new NotExistException("아이디가 일치하지 않습니다.");
        }
        if (!password.equals("12345")) {
            throw new WrongPasswordException("비밀번호가 틀림");
        }
    }
}
