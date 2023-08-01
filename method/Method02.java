public class Method02 {
	public static void main(String[] args) {
		AA a = new AA();
		a.B(4, 4, '#');

	}
}

class AA {
	public void B(int m, int n, char c) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
}