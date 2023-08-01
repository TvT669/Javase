public class OverLoad02 {
	public static void main(String[] args) {
		Methods m = new Methods();
		System.out.println("max" + m.max(2, 3));
		System.out.println("max" + m.max(2.5, 3.5));
		System.out.println("max" + m.max(2.0, 3.0, 4.0));

	}
}

class Methods {
	public int max(int a, int b) {
		return a > b ? a : b;
	}

	public double max(double a, double b) {
		return a > b ? a : b;
	}

	public double max(double a, double b, double c) {
		return (a > b ? a : b) > c ? (a > b ? a : b) : c;
	}
}