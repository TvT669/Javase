import java.util.Scanner;
public class ifExercise02{
	public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("请输入信用分1-100：");
    int n = scanner.nextInt();
    if(n>=1&&n<=100){
    if(n==100)
    {
    	System.out.println("信用极好");
    }
    else if(n>80&&n<=99)
    {
    	System.out.println("信用优秀");
    }
    else if(n>=60&&n<=80)
    {
    	System.out.println("信用一般");  
    }
    else {
    	System.out.println("信用不及格");
    }
}
    else 
    {
        System.out.println("输入的信用分有误");
    }
	}
}