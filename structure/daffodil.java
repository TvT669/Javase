import java.util.Scanner;

public class daffodil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		int num = scanner.nextInt();
		int i = num / 100;
		int j = num % 10;
		int k = num / 10 % 10;
		if (num == i * i * i + j * j * j + k * k * k) {
			System.out.println("��ˮ�ɻ���");
		} else {
			System.out.println("����ˮ�ɻ���");
		}
	}
}
