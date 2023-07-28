import java.util.Scanner;
public class break02{
	public static void main(String[]args){
		Scanner scanner = new Scanner(System.in);
		for(int i = 1;i <= 3;i++){
			System.out.println("请输入用户名");
			String name = scanner.next();
			System.out.println("请输入密码");
			String code = scanner.next();
			if("丁真".equals(name) && "666".equals(code) ){
				System.out.println("登录成功");
				break;
			}
			else{
				System.out.println("你还有"+(3-i)+"次机会");
			}
		}
	}
} 