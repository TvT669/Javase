import  java.util.Scanner;
public class dowhile04{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("������");
			System.out.println("��Ǯ��");
			answer = scanner.next().charAt(0);
			System.out.println("���Ĵ���"+answer);
		}while(answer != 'y');

	}
}