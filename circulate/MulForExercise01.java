import java.util.Scanner;

public class MulForExercise01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double totalsum = 0;
		int count = 0;
		for (int j = 1; j <= 3; j++) {
			double sum = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.println("请输入" + j + "班级" + i + "个学生的成绩");
				double score = scanner.nextDouble();
				if (score >= 60) {
					count++;
				}
				sum += score;
			}
			System.out.println(j + "班级总分为" + sum + " 平均分为" + (sum / 5));
			totalsum += sum;
		}
		System.out.println("所有班级的总分为" + totalsum + " 平均分为" + (totalsum / 5));
		System.out.println("及格人数为" + count);

	}

}
