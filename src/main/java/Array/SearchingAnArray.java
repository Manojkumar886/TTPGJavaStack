package Array;

import java.util.Scanner;

public class SearchingAnArray {
	public int searching(int [] arr1)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Which number you want");
		int number=scan.nextInt();
		for(int pos=0;pos<arr1.length;pos++)
		{
			if(arr1[pos]==number)
			{
				System.out.println(number+" This number index is  "+pos );
				return number;
			}
		}
		System.out.println(number+" not founded");
		return -1;
	}

	public static void main(String[] args) 
	{
		int [] arr= {1,2,3,45,6,7,99,87};
		SearchingAnArray obj=new SearchingAnArray();
		obj.searching(arr);
	}

}
