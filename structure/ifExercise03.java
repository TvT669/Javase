import java.util.Scanner;
public class ifExercise03{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ����");
		double num = scanner.nextDouble();
		if(num > 0){
			System.out.println("����0");
		}
		else if(num  < 0){
			System.out.println("С��0");
		}
		else if(num == 0){
			System.out.println("����0");
		}


	}
}