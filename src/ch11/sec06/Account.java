package ch11.sec06;

public class Account {
    private long balance;

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money;
    }

    public void withDraw(int money) throws InsufficientException {
        if (balance < money) {
            throw new InsufficientException("잔고부족: " + (money - balance) + "부족함");
        }
        balance -= money;
    }
}
