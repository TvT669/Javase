public class while02{
	public static void main(String[]args){
		int i = 40;
		int endNum = 200;
		while(i <= endNum){
			if(i % 2 == 0){
				System.out.println("i="+i);
			}
			i++;
		}
	}
}