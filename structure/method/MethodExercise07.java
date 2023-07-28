public class MethodExercise07{
	public static void main(String[]args){
		Employee a = new Employee("张三",'男',1800);
		System.out.println(a.name+a.sex+a.salary);

	}
}
class Employee{
	String name;
	char sex;
	int age;
	String position;
	int salary;//复用构造器先写少的再写多的
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