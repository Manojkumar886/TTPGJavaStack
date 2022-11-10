package ConsoleApplication;

public class App {

	public static void main(String[] args) 
	{
		ZealousAcademyAccess access=new ZealousAcademyAccess();
		Thread th1=new Thread(access,"Manojkumar");
		Thread th2=new Thread(access,"Thivin");
		Thread th3=new Thread(access,"Thilak");
		Thread th4=new Thread(access,"Pradeep");
		Thread th5=new Thread(access,"Vishnu");
		Thread th6=new Thread(access,"Ganesh");
	//	th4.setPriority(10);
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		
		
		
	}

}
