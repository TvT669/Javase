public class trangile {
	public static void main(String[] args) {
		int total = 20;
		for (int i = 1; i <= total; i++) {
			for (int k = 1; k <= total - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				if (j == 1 || j == 2 * i - 1 || i == total) {
					System.out.print('*');
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}
}