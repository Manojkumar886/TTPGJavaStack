package Array;

import java.util.Arrays;

public class SelectionSort {
	public void Sorting(int [] array1)
	{
		System.out.println("Before Sorting an Values"+Arrays.toString(array1));
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				if(array1[i]<array1[j])//55>41
				{
					array1[i]^=array1[j];//i=41
					array1[j]^=array1[i];//j=55
					array1[i]^=array1[j];//41=55
				}
			}
		}
		
	}

	public static void main(String[] args) 
	{
		int [] array= {55,41,7,8,9,15};
		SelectionSort obj =new SelectionSort();
		obj.Sorting(array);
		for(int arr:array)
		{
			System.out.println(arr);
		}

	}

}
