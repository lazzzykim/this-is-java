package ch11.sec06;

public class AccountEx {
    public static void main(String[] args) {

        Account account = new Account();

        account.deposit(10000);
        System.out.println("입금액: " + account.getBalance());

        // 출금
        try {
            account.withDraw(30000);
        } catch (InsufficientException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
}
