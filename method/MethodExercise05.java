public class MethodExercise05 {
	public static void main(String[] args) {
		Dog dog = new Dog("����", "��ɫ", 3);
		dog.show(dog);

	}
}

class Dog {
	String name;
	String color;
	int age;

	Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	public void show(Dog dog) {
		System.out.println("���� " + dog.name + " ��ɫ " + dog.color + " ���� " + dog.age);
	}
}