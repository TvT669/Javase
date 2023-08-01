public class Recursiono1 {
	public static void main(String[] args) {
		A a = new A();
		int n = -2;
		int res = a.F(n);
		System.out.println(res);
	}
}

class A {
	public int F(int n) {
		if (n >= 1) {
			if (n == 1 || n == 2) {
				return 1;
			} else {
				return F(n - 1) + F(n - 2);
			}
		} else {
			System.out.println("F");
			return -1;
		}
	}
}