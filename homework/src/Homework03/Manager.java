package Homework03;

import java.sql.SQLOutput;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double dailSalary, int days, double grade) {
        super(name, dailSalary, days, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void print(){
        System.out.print("经理");
        double salary = getDailSalary()*getDays()*getGrade()+getBonus();
        super.print();
    }
}
