public class ArrayMax{
	public static void main(String[]args){
		double []array = {};
		A01 a = new A01();
		Double rest = a.Max(array);
		if(rest != null){
		System.out.println("max= "+a.Max(array));
	}
	else{
		System.out.println("输入的数组为空");
	}


	}
}
class A01{
	public Double Max(double []array){ //返回对象为一个类
		if(array != null && array.length >0){
			//考虑到代码的健壮性
        double max = array[0];
		for(int i = 0;i < array.length;i++){
			if(max < array[i]){
				max = array[i];
			}

		}
		return max;}
		else{
			return null;
		}
	}
}