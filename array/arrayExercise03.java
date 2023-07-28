import java.util.Scanner;
public class Homework11{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		int[] arr = {10,12,45,90};
		System.out.println("请输入要添加的数");
		int addNum = scanner.nextInt();
		int index = -1;
		for(int i = 0;i < arr.length;i++){
			if(addNum < arr[i]){
				index = i;
				break;
			}
		}
		if(index == -1){
			index = arr.length;
		}
		int[]newarr = new int[arr.length+1];
		for(int i = 0,j = 0;i < newarr.length;i++){
			if(i == index){
				newarr[i] = addNum;
			}
			else{
				newarr[i] = arr[j];
				j++;
			}
		}
		arr = newarr;
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}