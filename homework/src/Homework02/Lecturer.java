package Homework02;

public class Lecturer extends Teacher {
    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        System.out.println("讲师的基本信息");
        super.introduce();
    }
}
