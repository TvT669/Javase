public class MethodExercise07{
	public static void main(String[]args){
		Employee a = new Employee("����",'��',1800);
		System.out.println(a.name+a.sex+a.salary);

	}
}
class Employee{
	String name;
	char sex;
	int age;
	String position;
	int salary;//���ù�������д�ٵ���д���
	public Employee(String position,int salary){
		this.position = position;
		this.salary = salary;
	}
	public Employee(String name,char sex,int salary){
		this.name = name;
		this.sex = sex;
		this.salary = salary;
	}
	
	public Employee(String name,char sex,int age,String position,int salary){
		this(name,sex,salary);
		this.position = position;
		this.salary = salary;


	}

}