import java.util.Scanner;
public class ifExercise02{
	public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("���������÷�1-100��");
    int n = scanner.nextInt();
    if(n>=1&&n<=100){
    if(n==100)
    {
    	System.out.println("���ü���");
    }
    else if(n>80&&n<=99)
    {
    	System.out.println("��������");
    }
    else if(n>=60&&n<=80)
    {
    	System.out.println("����һ��");  
    }
    else {
    	System.out.println("���ò�����");
    }
}
    else 
    {
        System.out.println("��������÷�����");
    }
	}
}