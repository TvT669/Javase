public class Recursion02 {
	public static void main(String[] args) {
		A a = new A();
		int res = a.peach(1);
		if (res != -1) {
			System.out.println("一共有" + res + "个桃");
		}

	}
}

class A {
	public int peach(int days) {
		if (days == 10) {
			return 1;
		} else if (days >= 1 && days <= 9) {
			return (peach(days + 1) + 1) * 2;
		} else {
			return -1;
		}
	}
}