public class dowhile03{
	public static void main(String[]args){
		int i = 1;
        int count = 0;
		do{
			if(i % 5 == 0 && i % 3 != 0){
				System.out.println(i);
				count++;
			}
			i++;
		}while(i<=200);
		System.out.println(count);
	}
}