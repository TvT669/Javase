public class OverLoad01 {
	public static void main(String[] args) {
		Methods b = new Methods();
		System.out.println(b.m(2));
		System.out.println(b.m(2, 3));
		b.m("sha");

	}
}

class Methods {
	public int m(int a) {
		return a * a;
	}

	public int m(int a, int b) {
		return a * b;
	}

	public void m(String a) {
		System.out.println(a);
	}
}