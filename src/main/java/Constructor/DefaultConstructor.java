package Constructor;

public class DefaultConstructor 
{
	int age;
	double salary;
	public void car()
	{
		System.out.println("car is four wheeler");
	}
	DefaultConstructor()
	{
		System.out.println("welcome to constructor,what you want which type of constructor you need");
		System.out.println("my age is "+age);
		System.out.println("my salary is "+salary);
	}
	
	public DefaultConstructor(int age,double salary1)
	{
		this.age=age;
		salary=salary1;
		System.out.println("my age is "+age+ "my salary is "+salary);
		
	}

	public static void main(String[] args) 
	{
		DefaultConstructor obj=new DefaultConstructor();
	//  classname   objectname=m.a constructor();
		obj.car();
		DefaultConstructor obj1=new DefaultConstructor(89, 987654);
	}

}
