import java.util.Scanner;
public class ifExercise03{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个数");
		double num = scanner.nextDouble();
		if(num > 0){
			System.out.println("大于0");
		}
		else if(num  < 0){
			System.out.println("小于0");
		}
		else if(num == 0){
			System.out.println("等于0");
		}


	}
}