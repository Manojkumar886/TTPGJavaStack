package Array;

public class JaggedArray {

	public static void main(String[] args) 
	{
		int [] array= {2,2,4,6,8,0,8,9,3,4,6};
		String [][] names= {{"Manoj","Thivin"},{"Pradeep"},{"Vishnu","Ganesh"}};
		for(int column=0;column<3;column++)
		{
			for(int row=0;row<names[column].length;row++)
			{
				System.out.print(names[column][row]+" ");
			}
			System.out.println();
		}
		int [][] jaggedArray=new int[3][];
		jaggedArray[0]=new int [3];
		jaggedArray[1]=new int [7];
		jaggedArray[2]=new int [1];
		int  count=0;
		//Value assumtion
		for(int column=0;column<3;column++)
		{
			for(int row=0;row<jaggedArray[column].length;row++)
			{
				jaggedArray[column][row]=count+=10;
			}
		}
		//printb a jagged value
		for(int column=0;column<3;column++)
		{
			for(int row=0;row<jaggedArray[column].length;row++)
			{
				System.out.print(jaggedArray[column][row]+" ");
			}
			System.out.println();
		}
		
	}

}
