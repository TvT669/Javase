import java.util.Scanner;

public class MulForExercise01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double totalsum = 0;
		int count = 0;
		for (int j = 1; j <= 3; j++) {
			double sum = 0;
			for (int i = 1; i <= 5; i++) {
				System.out.println("������" + j + "�༶" + i + "��ѧ���ĳɼ�");
				double score = scanner.nextDouble();
				if (score >= 60) {
					count++;
				}
				sum += score;
			}
			System.out.println(j + "�༶�ܷ�Ϊ" + sum + " ƽ����Ϊ" + (sum / 5));
			totalsum += sum;
		}
		System.out.println("���а༶���ܷ�Ϊ" + totalsum + " ƽ����Ϊ" + (totalsum / 5));
		System.out.println("��������Ϊ" + count);

	}

}
