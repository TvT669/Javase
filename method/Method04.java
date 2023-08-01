public class Method04 {
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "amy";
		p.age = 10;
		A a = new A();
		Person p2 = a.copyPerson(p);
		System.out.println(p.name + " " + p.age);
		System.out.println(p2.name + " " + p2.age);

	}
}

class Person {
	String name;
	int age;
}

class A {
	public Person copyPerson(Person p) {
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;
		return p2;
	}
}
