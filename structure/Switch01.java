import java.util.Scanner;

public class Switch01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char n = scanner.next().charAt(0);
		switch (n) {
			case 'a':
				System.out.println("����һ");
				break;

			case 'b':
				System.out.println("���ڶ�");
				break;
			case 'c':
				System.out.println("������");
				break;
			case 'd':
				System.out.println("������");
				break;
			case 'e':
				System.out.println("������");
				break;
			case 'f':
				System.out.println("������");
				break;
			case 'g':
				System.out.println("������");
				break;
			default:
				System.out.println("��������ȷ�ı��");
		}

	}
}