package Interface;

public class ConnectAnMultipleINheritance implements Moveable
{

	public static void main(String[] args) 
	{
		Person obj=new Person();
		obj.move();
		
//		obj.sleep();
//		obj.sleep();
		ConnectAnMultipleINheritance obj1=new ConnectAnMultipleINheritance();
		obj1.move();

	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Move is different access the interface");
	}



}
