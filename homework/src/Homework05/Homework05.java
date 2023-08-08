package Homework05;

public class Homework05 {
    public static void main(String[] args) {
       CheckingAccount checkingAccount = new CheckingAccount(2000);
       checkingAccount.deposit(10);
        System.out.println(checkingAccount.getBalance());
    }
}
