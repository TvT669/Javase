public class MoraGame {
	public static void main(String[] args) {
		Person p = new Person();
		Computer a = new Computer();
		a.compare(p, 5);

	}
}

class Person {
	int num;

	public Person() {

	}

	public Person(int num) {
		this.num = num;
	}

	public int setnum(int num) {
		return this.num = num;
	}
}

class Computer {
	public void compare(Person p, int times) {
		//
		// int num2 = (int)(Math.random()*3);
		for (int i = 0; i < times; i++) {
			int num1 = p.setnum((int) (Math.random() * 3));
			int num2 = (int) (Math.random() * 3);
			System.out.print(num1 + " " + num2);
			if ((num1 - num2 == -1) || (num1 - num2 == 2)) {
				System.out.println("Ӯ��");
			} else if (num1 == num2) {
				System.out.println("ƽ��");
			} else {
				System.out.println("����");
			}
		}
	}
}