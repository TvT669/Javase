public class ArrayFind{
	public static void main(String[]args){
		String []array = {"С��","С��","С��"};
		A02 a = new A02();
		if((a.find("С��",array))!= -1){
			System.out.println("�ҵ���"+a.find("С��",array));
		}
		else{
			System.out.println("û�ҵ�"+a.find("С��",array));
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