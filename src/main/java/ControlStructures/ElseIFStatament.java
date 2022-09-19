package ControlStructures;

public class ElseIFStatament {

	public static void main(String[] args) 
	{
		String name="Thivin";
		String name1="Vishnu";
		if(name=="Thivin")
		{
			System.out.println("This statement is not for thivin");
		}
		else if(name=="Praveen")
		{
			System.out.println("Yes,I am Praveen");
		}
		else if(name==name1)
		{
			System.out.println("I am vishnu");
		}
		else if(name!=name1)
		{
			System.out.println("yes, two names are different");
		}
		else
		{
			System.out.println("NNot connected" );
		}
	}

}
