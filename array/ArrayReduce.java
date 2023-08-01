import java.util.Scanner;

public class ArrayReduce {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		do {
			int[] newarr = new int[arr.length - 1];
			for (int i = 0; i < newarr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
			if (arr.length == 1) {
				System.out.println("不能缩减");
			}
			System.out.println("是否继续缩减");
			char key = scanner.next().charAt(0);
			if (key == 'n') {
				break;
			}
		} while (true);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}