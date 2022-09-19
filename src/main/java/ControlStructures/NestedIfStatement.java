package ControlStructures;

public class NestedIfStatement {

	public static void main(String[] args) 
	{
		char a='1';
		char b='2';
		
		if(a!=b)
		{
			System.out.println("Welcome to inner block of if statment");
			if(a!=b)
			{
				System.out.println("a charcter is not matching for b");
			}
			else
			{
				System.out.println("Inner block is wrong");
			}
		
		}
		else
		{
			System.out.println("Empty Fields");
		}
		

	}

}
