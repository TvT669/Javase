package Homework04;

public class Teacher extends Employee {
    private double courseSalary ;
    private int courseDay;

    public Teacher(String name, double salary) {
        super(name, salary);
    }

    public int getCourseDay() {
        return courseDay;
    }

    public void setCourseDay(int courseDay) {
        this.courseDay = courseDay;
    }

    public double getCourseSalary() {
        return courseSalary;
    }

    public void setCourseSalary(double courseSalary) {
        this.courseSalary = courseSalary;
    }
    public void printSal(){
        System.out.print(" 教师 ");
        System.out.println(getName()+" 工资 "+(getSalary()*getSalMonth()+getCourseSalary()*getCourseDay()));
    }
}
