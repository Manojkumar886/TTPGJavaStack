package Array;

import java.util.Arrays;
import java.util.Scanner;

public class PassingArrayValues {
	public void  searching(double[] numbers1)
	{
		System.out.println(numbers1.length);
		numbers1[0]=24.8;
		System.out.println(" Connected by methods"+Arrays.toString(numbers1));
	}

	public static void main(String[] args)
	{
		double [] numbers= {12.4,56.7,45.6,65.6,2.3};
		double [] num= {12,56,78,87};
		System.out.println(" Before passing a values in methods"+Arrays.toString(numbers));
		PassingArrayValues obj=new PassingArrayValues();
		obj.searching(num);
		
	}
}
