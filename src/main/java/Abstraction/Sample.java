package Abstraction;

public class Sample  extends Operator
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj=new Sample();
		obj.Types(89, 9);
		obj.calculate(10, 5);

	}

	@Override
	public void calculate(int x, int y) {
		// TODO Auto-generated method stub
		int a=x*y;
		System.out.println("a value is"+a);
		
	}

}
