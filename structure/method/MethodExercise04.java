public class MethodExercise04{
	public static void main(String[]args){
		Cale c = new Cale(1.0,0.0);
		c.addition();
		c.subtraction();
		c.multiplication();
		c.division();


	}
}
class Cale{
	double a;
	double b;
    Cale(double a,double b){
    	this.a = a;
    	this.b = b;
    }
    public void addition(){
    	System.out.println("�ͣ�"+(a+b));
    } 
     public void subtraction(){
    	System.out.println("�"+(a-b));
    }
      public void multiplication(){
    	System.out.println("����"+(a*b));
    }
      public void division(){
      	if(b == 0.0){
      		System.out.println("����������������");
      	}
      	else{
    	System.out.println("�̣�"+(a/b));
    }
    }
}