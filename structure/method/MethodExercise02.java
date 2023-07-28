public class MethodExercise02{
	public static void main(String[]args){
		A03 a = new A03();
		int []array = {1,2,3,4};
		int []newArray = a.copy(array);//忘记数组的接收了
	for(int i = 0;i < newArray.length;i++){
		System.out.print(newArray[i]+" ");
	}

	}
}
class A03{
	public int[] copy(int []array){
		int []newArray = new int[array.length];
		for(int i = 0;i < array.length;i++){
			newArray [i] = array[i];		
		}
		return newArray;
	}
}