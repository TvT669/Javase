public class sum{
	public static void main(String[]args){
		int sum = 0;
		for(int i = 1;i <= 100; i++){
			sum += i;	
			for(int j = 1;j < i;j++){
					sum += j;
				}
			
		}
		System.out.print(sum);
	}
}