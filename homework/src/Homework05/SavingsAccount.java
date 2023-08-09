package Homework05;

public class SavingsAccount extends BankAccount {
    private double rate = 0.01;
    private int count = 3;


    public SavingsAccount(double balance) {
        super(balance);
    }


    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double account) {
        if (count > 0) {
            super.deposit(account);

        } else {
           super.deposit(account - 1.0);
        }
        count--;

    }

    @Override
    public void withdraw(double account) {
        if (count > 0) {
            super.withdraw(account);
        } else {
             super.withdraw(account + 1.0);
        }
        count--;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}


