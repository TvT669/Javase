package Homework07;

public class Test {
    public static void main(String[] args) {
        Doctor d1 =  new Doctor("Anna",26,"注射",'女',4500.0);
        Doctor d2 =  new Doctor("john",26,"注射",'女',4500.0);
        System.out.println(d1.equals(d2));
    }


}
