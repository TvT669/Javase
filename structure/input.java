import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("进监狱");
		} else {
			System.out.println("放过");
		}
	}
}