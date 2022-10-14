package StringClass;

import java.util.ArrayList;

public class DemoStringClass 
{
	public static void main(String[] args) 
	{
		String name="Manojkumar";//literal
	String obj=new String("Vishnu");//non-literal
//		obj=obj.concat("THilak");
//		System.out.println(obj);
		name=name.concat("Thivin");//immutable
	
		System.out.println(name);
		System.out.println(name.charAt(5));
		System.out.println(name.equals(obj));
		String connect="Pradeep";//54
		String connect1="pradeep";//87  54-87=-33
		System.out.println(connect.compareTo(connect1));
		System.out.println(connect.endsWith("p"));
		System.out.println(name.replace("Manojkumar", "Chandrakanth"));
		String substr=name.substring(4);
		System.out.println(substr);
		System.out.println(substr.substring(6, 12));
		System.out.println(name.contains("nojkumarth"));
		System.out.println(name.length());
		String sentence="  i am pradeep i have completed java full stack   ";
		System.out.println(sentence);
		sentence=sentence.trim();
		System.out.println(sentence);
		String result="i am manojkumar i have completed BCA . ";
		System.out.println(result);
		String [] result1=result.split(" ");
		for(String str:result1)
		{
			System.out.print(str);
		}

		
	}

}
