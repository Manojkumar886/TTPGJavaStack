package Exception;

import java.io.IOException;

public class CompileTimeException {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro;
		pro =run.exec("notepad");
		Thread.sleep(5000);
		pro=run.exec("calc");
	}
}



//class Base
//{
//	private Base()//def constructor
//	{
//		
//	}
//	
//	private static Base base=new Base();
//  public static  Base getBase(){
//  return base;}
//}