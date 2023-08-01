import java.util.Scanner;

public class price {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = scanner.nextInt();
		System.out.println("请输入年龄");
		int age = scanner.nextInt();
		double p = 60;
		if (month >= 4 && month <= 10) {
			if (age >= 18 && age <= 60) {
				System.out.println(p);
			} else if (age < 18) {
				System.out.println(p * 0.5);
			} else if (age > 60) {
				System.out.println(p * (1.0 / 3));
			}

		} else {
			if (age >= 18 && age <= 60) {
				System.out.println("40");
			} else {
				System.out.println("20");
			}
		}

	}
}