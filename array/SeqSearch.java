import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = { "��ë", "��ë", "����", "����" };
		int flag = -1;
		System.out.println("�������������");
		String key = scanner.next();
		for (int i = 0; i < arr.length; i++) {
			if (key.equals(arr[i])) {
				System.out.println("���ҵ�\n" + "�±�ֵΪ" + i);
				flag = 1;
				break;
			}
		}
		if (flag == -1) {
			System.out.println("δ�ҵ�");
		}
	}
}