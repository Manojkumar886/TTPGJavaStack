package Inheritance;

public class HierConnection 
{
	public void connect()
	{
		System.out.println("Connected with hierchical inheritance");
	}
	public static void main(String[] args) 
	{
//		Teacher obj=new Teacher();
//		obj.child2();
//		obj.Base();
		Student obj=new Student();
		obj.child1();
		obj.Base();
		HierConnection hier=new HierConnection();
		hier.connect();
		
	}

}
