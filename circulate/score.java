import java.util.Scanner;
public class score{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		double totalsum = 0;
		int count = 0;
		for(int j = 1;j <= 3;j++){
		double sum = 0;
		for(int i = 1;i <= 5;i++){
			System.out.println("请输入"+j+"班"+i+"个孩子的成绩为");
			double score = scanner.nextDouble();
			if(score >= 60){
				count++;
			}
			sum += score;
		}
		System.out.println(j+"班总成绩为"+sum+"平均成绩为"+(sum / 5.0));
		totalsum += sum;
	}
	System.out.println("所有班总成绩为"+totalsum+"平均成绩为"+(totalsum / 3));
	System.out.println("及格人数为"+count);

}

}