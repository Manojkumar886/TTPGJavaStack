package ControlStructures;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) 
	{
//		Scanner obj=new Scanner(System.in);
//		System.out.println("Please,tellus one digit number");
//		int number=obj.nextInt();
		int number=7; 
		String name="Praveen";
		
		switch(name)
		{
		case "Praveen":
			System.out.println("My value is szero");
			break;
		case "hd":
			System.out.println("My value is one");
			break;
		case "Pan":
			System.out.println("My value is Two");
			break;
		case "Manoj":
			System.out.println("My value is Four");
			break;
		case "Thilak":
			System.out.println("My value is nine");
			break;
			default: System.out.println("My value is not available");
		}
		
	}

}
