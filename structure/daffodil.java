import java.util.Scanner;

public class daffodil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		int num = scanner.nextInt();
		int i = num / 100;
		int j = num % 10;
		int k = num / 10 % 10;
		if (num == i * i * i + j * j * j + k * k * k) {
			System.out.println("是水仙花数");
		} else {
			System.out.println("不是水仙花数");
		}
	}
}
