import  java.util.Scanner;
public class dowhile04{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("五连鞭");
			System.out.println("还钱吗");
			answer = scanner.next().charAt(0);
			System.out.println("他的答案是"+answer);
		}while(answer != 'y');

	}
}