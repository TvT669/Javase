import java.util.Scanner;
public class score{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		double totalsum = 0;
		int count = 0;
		for(int j = 1;j <= 3;j++){
		double sum = 0;
		for(int i = 1;i <= 5;i++){
			System.out.println("������"+j+"��"+i+"�����ӵĳɼ�Ϊ");
			double score = scanner.nextDouble();
			if(score >= 60){
				count++;
			}
			sum += score;
		}
		System.out.println(j+"���ܳɼ�Ϊ"+sum+"ƽ���ɼ�Ϊ"+(sum / 5.0));
		totalsum += sum;
	}
	System.out.println("���а��ܳɼ�Ϊ"+totalsum+"ƽ���ɼ�Ϊ"+(totalsum / 3));
	System.out.println("��������Ϊ"+count);

}

}