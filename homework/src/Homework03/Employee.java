package Homework03;

public class Employee {
    private String name;
    private double dailSalary;
    private int days;
    private double grade;

    public Employee(String name, double dailSalary, int days, double grade) {
        this.name = name;
        this.dailSalary = dailSalary;
        this.days = days;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDailSalary() {
        return dailSalary;
    }

    public void setDailSalary(double dailSalary) {
        this.dailSalary = dailSalary;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    public void print(){
        double salary = getDailSalary()*getDays()*getGrade();
        System.out.println(getName()+"  日薪"+getDailSalary()+" 工作天数"+getDays()+"  薪水"+salary);
    }
}
