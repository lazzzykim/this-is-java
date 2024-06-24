package ch06.ex.num4;

public class Account {

    private int balance;
    static final int MAX_BALANCE = 1000000;
    static final int MIN_BALANCE = 0;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance > MAX_BALANCE || balance < MIN_BALANCE) {
            return;
        } else {
            this.balance += balance;
        }
    }
}
