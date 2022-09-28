package Array;

import java.util.Arrays;

public class BinarySearch {
	public int binary(int[] arr1,int low,int high,int key)
	{
		if(low<high)
		{
			int mid=(high+low)/2;
			if(arr1[mid]==key)
				return mid;
			else if(arr1[mid]>key)
				return binary(arr1,low,mid,key);
			else if(arr1[mid]<key)
				return binary(arr1,mid+1,high,key);
		}
		return -1;
	}

	public static void main(String[] args) 
	{
//		String [] name= {"Manoj","Pradeep","Dhilak","Thivin","Vishnu"};
//		Arrays.sort(name);
//		System.out.println(Arrays.toString(name));
		int [] array= {23,56,78,90,78,35,234,65,2,12};
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		BinarySearch search=new BinarySearch();
		int key=78;
		System.out.println(key+" founded by index of "+search.binary(array,0,array.length,key));

	}

}
