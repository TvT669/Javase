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
    	System.out.println("和："+(a+b));
    } 
     public void subtraction(){
    	System.out.println("差："+(a-b));
    }
      public void multiplication(){
    	System.out.println("积："+(a*b));
    }
      public void division(){
      	if(b == 0.0){
      		System.out.println("请重新输入两个数");
      	}
      	else{
    	System.out.println("商："+(a/b));
    }
    }
}