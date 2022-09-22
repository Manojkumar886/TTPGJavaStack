package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args)
	{
		
		String [] MobileNames={"RealMe","Redmi","Oppo","Samsung","Apple","Nokia"};
		System.out.println("BEfore updating a value"+Arrays.toString(MobileNames));
		Scanner scan=new Scanner(System.in);
	//	System.out.println(MobileNames[2]);
		System.out.println("Please,Tell us what is position to update");
		int pos=scan.nextInt();
		System.out.println("Tell us your new values");
		String newone=scan.next();
		MobileNames[pos]=newone;//samsung=oppo;//Updating
		System.out.println("After updating value");
		for(String mobile :MobileNames)
		{
			System.out.print(mobile+", ");
		}
		
	}

}
