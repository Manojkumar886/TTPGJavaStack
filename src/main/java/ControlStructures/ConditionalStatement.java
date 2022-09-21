package ControlStructures;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Praveen Enterprises");
		System.out.println("Please,Tell us what is purpose of laptop you need , IT<ACCOUNTS<GAMES<GENERALUSE");
		String usage=scan.next();
		switch(usage)
		{
		case "IT":
			System.out.println("your asked it professional laptop is currently available");
			System.out.println("Tell us which amount laptop you want");
			int price =scan.nextInt();
			if(price>30000&&price<60000&&price<80000)
			{
				System.out.println(price+"this price laptops are lenovo,acer,hp,asus,dell");
				String types=scan.next();
				switch(types)
				{
				case "dell":
					System.out.println(types+" this laptop benefits are i5 prossesor,6gb RAM,MORe then colour");
				break;
				default :System.out.println("Thank you ,please get out the my shop");
				
				}
			}
			else
			{
				System.out.println("This price is not available for IT laptops");
			}
			break;
		case "ACCOUNTS":
			break;
		case "GAMES":
			break;
		case "GENERALUSE":
			break;	
		default :System.out.println("Currently Not available");
		}
	}

}
