public class Method01 {
	public static void main(String[] args) {
		AA a = new AA();
		if (a.isodd(20)) {
			System.out.println("ÆæÊý");
		} else {
			System.out.println("Å¼Êý");
		}

	}
}

class AA {
	public boolean isodd(int n) {
		return n % 2 != 0 ? true : false;
	}
}