public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 24, 69, 80, 57, 13 };
		int t = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					t = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = t;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}