package Homework05;

public class SavingsAccount extends CheckingAccount{
 private double interest;
 

    public SavingsAccount(double balance) {
        super(balance);
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }



    public void earnMonthlyInterest(){
        System.out.println(getBalance() +interest);
    //
    }

}
