package Homework05;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }
    public double deposit(double account){
        return balance += account;
    }
    public double withdraw(double account){
        return balance -= account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
