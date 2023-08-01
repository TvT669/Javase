public class arrayExercise {
	public static void main(String[] args) {
		int[] arr = new int[10];
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			sum += arr[i];
		}
		System.out.print("Ë³£º  ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("  µ¹£º  ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" sum=" + sum + "  average =" + (sum / arr.length));
		int max = arr[0];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("max=" + max + "  index=" + index);
		int num = 8;
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				flag = 1;
				System.out.println("ÓÐ8");
				break;
			}
		}
		if (flag == 0) {
			System.out.println("Ã»8");
		}

	}
}