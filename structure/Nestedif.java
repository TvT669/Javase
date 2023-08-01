import java.util.Scanner;

public class Nestedif {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double score = scanner.nextDouble();
		char gender = scanner.next().charAt(0);
		if (score > 8.0) {
			if (gender == '女') {
				System.out.println("恭喜进入女子组");
			} else {
				System.out.println("恭喜进入男子组");
			}
		} else {
			System.out.println("淘汰");
		}
	}
}