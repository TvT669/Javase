public class MethodExercise06 {
	public static void main(String[] args) {
		Music a = new Music("��", 4.3);
		a.play();
		System.out.println(a.getinfo());

	}
}

class Music {
	String name;
	double times;

	public Music(String name, double times) {
		this.name = name;
		this.times = times;
	}

	public void play() {
		System.out.println("���ڲ���" + this.name + " " + this.times);
	}

	public String getinfo() {
		return "����" + this.name + "ʱ��" + this.times;
	}
}