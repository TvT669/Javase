package Homework07;

public class Doctor extends Object {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }
    public boolean equals(Object obj){
        if(this == obj ){
            return true;
        }
        if(obj instanceof Doctor){
            Doctor d = (Doctor) obj;
            return  this.getAge()==d.getAge() && this.getName().equals(d.getName()) && this.getGender()==d.getGender() &&this.getJob().equals(d.getJob()) &&this.getSal()==d.getSal();
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
