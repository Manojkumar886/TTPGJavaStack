package Abstraction;

public class AbstractConnection extends Operator
{

	public static void main(String[] args) 
	{
		AbstractConnection obj=new AbstractConnection();
		obj.Types(89, 9);
		obj.calculate(30, 70);
	}

	@Override
	public void calculate(int x, int y)
	{
		int a=x+y;
		System.out.println("A value is : "+a);
	}

}
