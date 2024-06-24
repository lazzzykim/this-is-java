package ch06.ex.num5;

import java.util.Objects;
import java.util.Scanner;

public class BankApplication {

    private static Account[] account = new Account[100];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean run = true;
        while (run) {
            System.out.println("-------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택> ");
            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) {
                creatAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                System.out.println("종료합니다.");
                run = false;
            }
        }
    }

    private static void withdraw() {
        System.out.println("출금");
        System.out.print("계좌번호 입력: ");
        String accountNum = scanner.nextLine();

        Account account = findAccount(accountNum);
        if (account != null) {
            System.out.print("출금액 입력: ");
            int money = Integer.parseInt(scanner.nextLine());
            account.setBalance(account.getBalance() - money);
            System.out.println("출금 완료");
        }
    }

    private static void deposit() {
        System.out.println("입금");
        System.out.print("계좌번호 입력: ");
        String accountNum = scanner.nextLine();

        Account account = findAccount(accountNum);
        if (account != null) {
            System.out.print("입금액 입력: ");
            int money = Integer.parseInt(scanner.nextLine());
            account.setBalance(account.getBalance() + money);
            System.out.println("입금 완료");
        }
    }

    private static Account findAccount(String accountNum) {
        for (Account account : account) {
            if (account != null && accountNum.equals(account.getAccountNum())) {
                return account;
            }
        }
        return null;
    }

    private static void accountList() {
        System.out.println("계좌 목록");
        for (Account account : account) {
            if (account != null) {
                System.out.println(account.getAccountNum() + account.getAccountOwner() + account.getBalance());
            }
        }
    }

    private static void creatAccount() {
        System.out.print("계좌번호 입력: ");
        String accountNum = scanner.nextLine();
        System.out.print("성함 입력: ");
        String accountOwn = scanner.nextLine();
        System.out.print("초기 입금액: ");
        int balance = Integer.parseInt(scanner.nextLine());

        Account newAccount = new Account(accountNum, accountOwn, balance);
        for (int i = 0; i < account.length; i++) {
            if (account[i] == null) {
                account[i] = newAccount;
                System.out.println("계좌 생성완료");
                break;
            }
        }
    }
}
