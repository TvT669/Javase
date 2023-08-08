package Homework03;

public class OrEmployee extends Employee{
    public OrEmployee(String name, double dailSalary, int days, double grade) {
        super(name, dailSalary, days, grade);
    }
    public void print(){
        System.out.print("普通员工");
        super.print();
    }
}
