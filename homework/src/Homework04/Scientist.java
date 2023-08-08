package Homework04;

public class Scientist extends Employee {
    private double annualAward;

   public Scientist(String name,double salary){
       super(name,salary);
   }

    public double getAnnualAward() {
        return annualAward;
    }

    public void setAnnualAward(double annualAward) {
        this.annualAward = annualAward;
    }
    public void printSal(){
        System.out.print(" 科学家 ");
        System.out.println(getName()+" 工资 "+(getSalary()*getSalMonth() +getAnnualAward()));
    }
}
