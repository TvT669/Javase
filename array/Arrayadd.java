import java.util.Scanner;

public class Arrayadd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 1, 2, 3 };
		do {
			int[] newarr = new int[arr.length + 1];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			System.out.println("������Ҫ��ӵ���");
			int addNum = scanner.nextInt();
			newarr[newarr.length - 1] = addNum;
			arr = newarr;
			System.out.println("�Ƿ�Ҫ���");
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