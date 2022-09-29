package Inheritance;

public class MultilevelStudent extends MultilevelEngineerStudent
{
	public void stduent()
	{
		System.out.println("More then topic of student worked in IT Field");
	}

	public static void main(String[] args) 
	{
		MultilevelStudent student1=new MultilevelStudent();
		student1.stduent();
		student1.EngineerStudent();
		student1.ArtsStudent();
	}

}
