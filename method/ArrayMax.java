public class ArrayMax {
	public static void main(String[] args) {
		double[] array = {1,2,3,4,5,6,7,8,9};
		A01 a = new A01();
		Double rest = a.Max(array);
		if (rest != null) {
			System.out.println("max= " + a.Max(array));
		} else {
			System.out.println("���������Ϊ��");
		}

	}
}

class A01 {
	public Double Max(double[] array) { // ���ض���Ϊһ����
		if (array != null && array.length > 0) {
			// ���ǵ�����Ľ�׳��
			double max = array[0];
			for (int i = 0; i < array.length; i++) {
				if (max < array[i]) {
					max = array[i];
				}

			}
			return max;
		} else {
			return null;
		}
	}
}