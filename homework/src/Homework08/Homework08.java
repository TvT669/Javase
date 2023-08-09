package Homework08;

public class Homework08 {
    public static void main(String[] args) {
        Person[] arr = new Person[4];
        arr[0] = new Teacher("张飞", '男', 30, 5);
        arr[1] = new Teacher("李四", '男', 25, 2);
        arr[2] = new Student("小明", '男', 15, "00023102");
        arr[3] = new Student("小红", '女', 12, "00023101");
        Homework08 homework08 = new Homework08();
        homework08.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

        for (int i = 0; i < arr.length ; i++) {
            homework08.test(arr[i]);


        }


    }

    public void bubbleSort(Person[] arr) {
        Person temp = null;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].getAge() < arr[j + 1].getAge()) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }
    public void test(Person p){
        if(p instanceof Student){
            ((Student) p).study();
        }
        else if(p instanceof Teacher){
            ((Teacher) p).teach();
        }
        else {
            System.out.println("do nothing");

        }
    }
}





