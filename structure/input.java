import java.util.Scanner;

public class input {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������������");
		int age = scanner.nextInt();
		if (age > 18) {
			System.out.println("������");
		} else {
			System.out.println("�Ź�");
		}
	}
}