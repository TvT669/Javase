package Homework05;

public class Homework05 {
    public static void main(String[] args) {
      SavingsAccount savingsAccount = new SavingsAccount(600);
      savingsAccount.deposit(100);
      savingsAccount.deposit(100);
      savingsAccount.deposit(100);
      savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
        savingsAccount.earnMonthlyInterest();
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());
    }
}
