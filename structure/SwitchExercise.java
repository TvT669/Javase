import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();

		if (score >= 0 && score <= 100) {
			int t = (int) (score / 60);
			switch (t) {
				case 1:
					System.out.println("�ϸ�");
					break;
				case 0:
					System.out.println("������");
			}
		} else {
			System.out.println("����ĳɼ�����");
		}

	}
}