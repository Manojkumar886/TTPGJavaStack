package Interface;

public class Person implements Speakable,Sleepable,Moveable 
{

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Your are human....so move to any where");
	}

	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("minimum eight hours sleep is must ");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Speak is very important in all our life");
	}
	

	

}
