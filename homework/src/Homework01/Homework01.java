package Homework01;


public class Homework01 {
    public static void main(String[] args) {
        Person []arr = new Person[3];
        arr[0] = new Person("Anna", 18, "student");
        arr[1] = new Person("marry",12,"student");
        arr[2] = new Person("Bob",10,"student");
        Person temp = null;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[i].getAge() < arr[i+1].getAge()){
                    temp  = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }

            }

        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);

        }



    }
}
