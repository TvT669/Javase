
public  class Letter{
	public static void main(String[]args){
		char a[] = new char[26];
		for(int i = 0;i < 26;i++){ 
			a[i] =(char)('A' + i);
		}
		for(int i = 0;i < 26;i++){
			System.out.print(a[i]+" ");
		}
	}
}