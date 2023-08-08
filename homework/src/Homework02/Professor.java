package Homework02;

public class Professor extends Teacher {
    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        System.out.println("教授的基本信息");
        super.introduce();
    }
}
