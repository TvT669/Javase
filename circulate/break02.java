import java.util.Scanner;
public class break02{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			System.out.println("�������û���");
			String name = scanner.next();
			System.out.println("����������");
			String code = scanner.next();
			if("����".equals(name) && "666".equals(code) ){
				System.out.println("��¼�ɹ�");
				break;
			}
			else{
				System.out.println("�㻹��"+(3-i)+"�λ���");
			}
		}
	}
} 