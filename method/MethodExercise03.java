public class MethodExercise03 {
	public static void main(String[] args) {
		Circle a = new Circle(2.0);
		a.displayArea();

	}
}

class Circle {
	double r;

	Circle(double r) {
		this.r = r;
	}

	public void displayArea() {
		double area = 3.14 * r * r;
		System.out.println("area=" + area);
	}

}