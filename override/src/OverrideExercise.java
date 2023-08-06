public class OverrideExercise {
    public static void main(String[] args) {
        Person person = new Person("小蜜蜂",19);
        System.out.println(person.say());
        Student student = new Student("小蜜蜂",19,"202214060214",100.0);
        System.out.println(student.say());
    }
}
