package Polymorphism;
//
public class MethodOverloding {
	public void calculate(int a,int b)
	{
		int c=a+b;
		System.out.println("c value is "+c);
	}
	public void calculate(int a,int b,int c)
	{
		int d=a-b-c;
		System.out.println("d value is "+d );
	}
	public void calculate(float b,float c)
	{
		float d=b*c;
		System.out.println("Float value d is "+d );
	}
	public void calculate()
	{
		System.out.println("It is normal calculate method to access the method overloding");
	}

	public static void main(String[] args) 
	{
		MethodOverloding over=new MethodOverloding();
		over.calculate();
		over.calculate(67, 7, 6);
		over.calculate(89.9f, 9.89f);
	
	}

}
