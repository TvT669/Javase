public class Method03{
	public static void main(String[]args){
    MyTool b = new MyTool();
    int[][] arr1 = {{1,2,3},{1,2},{1}};
    b.A(arr1);
	}
}
class MyTool{
	public void A(int[][] arr){
		for(int i = 0;i < arr.length;i++){
			for(int j = 0; j < arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}