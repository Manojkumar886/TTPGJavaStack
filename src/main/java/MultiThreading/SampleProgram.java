package MultiThreading;

public class SampleProgram 
{
	public static void main(String[] args) throws InterruptedException 
	{
		note nt=new note();
		book bk=new book();
		nt.start();//run
		Thread obj=new Thread(bk);
		obj.start();
		
		obj.join();
		nt.join();
		
		System.out.println("Thank you");
	}
}

class note extends Thread
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("update a note");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class book implements Runnable 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			System.out.println(e);
			}
		}
	}
}