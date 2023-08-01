public class MethodExercise06 {
	public static void main(String[] args) {
		Music a = new Music("二", 4.3);
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
		System.out.println("正在播放" + this.name + " " + this.times);
	}

	public String getinfo() {
		return "歌名" + this.name + "时长" + this.times;
	}
}