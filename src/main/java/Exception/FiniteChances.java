package Exception;

import java.util.Scanner;

public class FiniteChances {
	private String currentdata="i am manojkumar from namakkal ";
	
	Scanner scan=new Scanner(System.in);
	public void extract()
	{
		try
		{
			System.out.println("enter the first index of");
			int start=scan.nextInt();
			System.out.println("enter the last index of(position");
			int end=scan.nextInt();
			System.out.println(currentdata.substring(start, end));
		}
		catch(StringIndexOutOfBoundsException exe)
		{
			System.out.println(exe);
			System.out.println("Start with 0 end in"+currentdata.length());
			throw exe;
//			if(attempts<3)
//			{
//				attempts++;
//				extract(attempts);
//			}
//			else
//			{
//				System.out.println("max attempts reached");
//			}
		}
	}

	public static void main(String[] args) 
	{
		FiniteChances chance=new FiniteChances();
		try
		{
			chance.extract();
		}
		catch(StringIndexOutOfBoundsException exe)
		{
			System.out.println(exe);
			chance.extract();
		}
	}

}
