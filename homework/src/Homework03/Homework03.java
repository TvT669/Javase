package Homework03;

public class Homework03 {
    public static void main(String[] args) {
        Manager manager  = new Manager("小蜜蜂", 1000.0, 30, 1.2);
        manager.setBonus(1000.0);
        manager.print();
        OrEmployee orEmployee = new OrEmployee("新崽",500.0,30,1.0);
        orEmployee.print();
    }
}
