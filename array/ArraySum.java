import java.util.Scanner;

public class ArraySum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = scanner.nextInt();
			sum += arr[i];
		}
		System.out.print("和 " + sum + "平均值 " + (sum / 5));
	}
}