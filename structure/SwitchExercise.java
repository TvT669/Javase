import java.util.Scanner;

public class SwitchExercise {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();

		if (score >= 0 && score <= 100) {
			int t = (int) (score / 60);
			switch (t) {
				case 1:
					System.out.println("合格");
					break;
				case 0:
					System.out.println("不及格");
			}
		} else {
			System.out.println("输入的成绩有误");
		}

	}
}