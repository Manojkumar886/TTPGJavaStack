package Inheritance;

public class Human extends Girl implements Bestiee,GirlLover
{
	public void GoodSoul()
	{
		System.out.println("Bad,Good");
	}

	public static void main(String[] args) 
	{
		Human obj=new Human();
		obj.buildup();
		obj.GoodSoul();
		obj.lovers();
		obj.girlbestiee();
	}

	@Override
	public void lovers() 
	{
		
	System.out.println("Pure love- TajMahal");	
	}

	@Override
	public void girlbestiee() 
	{
	System.out.println("Irritating Fellow");	
	}

}
