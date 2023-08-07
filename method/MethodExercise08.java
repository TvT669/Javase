public class MethodExercise08 {
	public static void main(String[]args){
		Circle a = new Circle();
		PassObject b = new PassObject();
		b.printArea(a,5);
	}
}
class Circle {
	double radius;
	public Circle(){

	}
	public Circle(double radius){
		this.radius = radius;
	}
	public double findArea(){
		return Math.PI*radius*radius;
	}
	public void SetRadius(double radius){
		this.radius = radius;
	}
}
class PassObject{
	public void printArea(Circle c, int times){
		System.out.println("r\tarea");
		for(int i = 1;i <= times;i++){
			c.SetRadius(i);
			System.out.println((double)i+"\t"+c.findArea());
		}

	}
}