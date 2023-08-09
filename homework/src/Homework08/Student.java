package Homework08;

public class Student extends Person {
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println(getName()+"承诺，我会好好学习");
    }
    public String play(){
        return super.play()+"足球";
    }

    public void print(){
        System.out.println("学生的信息：");
        super.print();
        System.out.print("\n学号："+getStu_id());
        study();
        System.out.println(play());

    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
