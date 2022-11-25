package NonAccessModifier;

final class DemoFinal 
{
	final int a=10;
	final void display()
	{
		
		System.out.println(a);
	}

	public static void main(String[] args)
	{
		DemoFinal fine=new  DemoFinal();
		fine.display();
	}

}
