package Homework02;

public class AsProfessor extends Teacher {
    public AsProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    public void introduce(){
        System.out.println("副教授的基本信息");
        super.introduce();
    }
}
