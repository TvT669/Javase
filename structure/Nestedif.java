import java.util.Scanner;

public class Nestedif {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		char gender = scanner.next().charAt(0);
		if (score > 8.0) {
			if (gender == 'Ů') {
				System.out.println("��ϲ����Ů����");
			} else {
				System.out.println("��ϲ����������");
			}
		} else {
			System.out.println("��̭");
		}
	}
}