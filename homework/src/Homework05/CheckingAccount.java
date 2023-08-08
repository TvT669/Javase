package Homework05;

public class CheckingAccount extends BankAccount {
    private double commission=1.0;
    public CheckingAccount(double balance) {
        super(balance);
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public double deposit(double account) {
        return super.deposit(account-commission);
    }

    @Override
    public double withdraw(double account) {
        return super.withdraw(account+commission);
    }
}
