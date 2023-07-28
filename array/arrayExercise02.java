import java.util.Scanner;
public class arrayExercise02{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int[]arr = {10,12,45,90};
		int[]newarr = new int[arr.length+1];
		System.out.println("请输入要添加的数");
		int addNum = scanner.nextInt();
		newarr[arr.length] = addNum;
		for(int i = 0; i < arr.length;i++){
			newarr[i] = arr[i];
		}
		arr = newarr;
		int t = 0;
		for(int i = 0;i < arr.length-1;i++){
			for(int j = 0;j < arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                	t = arr[j];
                	arr[j] = arr[j+1];
                	arr[j+1] = t;
                }
			}
		}
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}