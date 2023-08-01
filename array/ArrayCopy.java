public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr1 = { 10, 20, 30 };
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}