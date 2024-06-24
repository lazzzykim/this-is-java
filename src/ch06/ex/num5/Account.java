package ch06.ex.num5;

public class Account {
    private String accountNum;
    private String accountOwner;
    private int balance;

    public Account(String accountNum, String accountOwner, int balance) {
        this.accountNum = accountNum;
        this.accountOwner = accountOwner;
        this.balance = balance;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountOwner(String owner) {
        this.accountOwner = owner;
    }
}
