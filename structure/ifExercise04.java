import java.util.Scanner;

public class ifExercise04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������");
		int year = scanner.nextInt();
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("����");
		} else {
			System.out.println("ƽ��");
		}
	}
}