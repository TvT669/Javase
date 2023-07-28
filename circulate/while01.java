public class while01{
	public static void main(String[]args){
		int i = 1;
		int endNum = 100;
		while(i <= endNum){
			if(i % 3 == 0){
				System.out.println("i="+i);
			}
			i++;  
		}
	}
}