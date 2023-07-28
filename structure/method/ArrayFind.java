public class ArrayFind{
	public static void main(String[]args){
		String []array = {"小白","小黑","小红"};
		A02 a = new A02();
		if((a.find("小红",array))!= -1){
			System.out.println("找到了"+a.find("小红",array));
		}
		else{
			System.out.println("没找到"+a.find("小红",array));
		}

	}
}
class A02{
	public int find(String a,String []array){
		int index = -1;
		for(int i = 0;i < array.length;i++){
			if(a.equals(array[i])){
				index = i;
			}
		}
		return index;
	}
}