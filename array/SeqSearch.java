import java.util.Scanner;

public class SeqSearch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] arr = { "白毛", "金毛", "紫衫", "青翼" };
		int flag = -1;
		System.out.println("请输入查找内容");
		String key = scanner.next();
		for (int i = 0; i < arr.length; i++) {
			if (key.equals(arr[i])) {
				System.out.println("已找到\n" + "下标值为" + i);
				flag = 1;
				break;
			}
		}
		if (flag == -1) {
			System.out.println("未找到");
		}
	}
}