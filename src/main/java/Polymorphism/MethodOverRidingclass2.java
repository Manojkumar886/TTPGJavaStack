package Polymorphism;

public class MethodOverRidingclass2 extends MethodOverRidingclass1
{
	public void calculate(double a,double b)
	{
		double c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) 
	{
	MethodOverRidingclass2 obj=new MethodOverRidingclass2();
	obj.calculate(98,78);
	MethodOverRidingclass1 obj1=new MethodOverRidingclass1();
	obj1.calculate(56, 67);
	//upcasting-referenced by a parent class but object are created by child class
	MethodOverRidingclass1 obj2=new MethodOverRidingclass2();
	obj2.calculate(89, 98);
	}

}
