public class VarParameter {
	public static void main(String[] args) {
		Method m = new Method();
		System.out.println(m.showScore("Amy", 7.0, 8.0));

	}
}

class Method {
	public String showScore(String a, double... nums) {
		double res = 0;
		for (int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return a + " " + res;
	}
}