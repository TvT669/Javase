package Homework04;

public class Homework04 {
    public static void main(String[] args) {
        Worker worker = new Worker("Anna",4500);
        worker.setSalMonth(15);
        worker.printSal();
        Peasant peasant = new Peasant("Bob",3000);
        peasant.printSal();
        Teacher teacher = new Teacher("Marry",1200);
        teacher.setCourseSalary(50.0);
        teacher.setCourseDay(120);
        teacher.printSal();
        Scientist scientist = new Scientist("Smith",3000);
        scientist.setAnnualAward(5000);
        scientist.printSal();
        Waiter waiter = new Waiter("Ciddy",950);
        waiter.printSal();
    }
}
