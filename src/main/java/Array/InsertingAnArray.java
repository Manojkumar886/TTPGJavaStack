package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingAnArray {

	public static void main(String[] args) 
	{
		String [] name=new String[10];
//		name[5]="Praveen";
//		name[9]="Dhilak";
//		name[1]="Manoj";
//		System.out.println(Arrays.toString(name));
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<name.length;i+=2)
		{
			System.out.println("What is your name");
			name[i]=scanner.nextLine();
		}
		
		for(int i=0;i<name.length;i++)
		{
			if(name[i]!=null)
				System.out.println(name[i]);
		}
		
	}

}
