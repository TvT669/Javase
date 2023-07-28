public class ArrayReverse{
	public static void main(String[]args){
		int[] arr1 = {66,55,44,33,22,11};
		int[] arr2 = new int[arr1.length];
		for(int i = arr1.length - 1,j = 0;i >= 0;i--,j++){
            arr2[j] = arr1[i];
		}
		for(int i = 0;i < arr1.length;i++){
			System.out.print(arr2[i]+" ");
		}
	}
}