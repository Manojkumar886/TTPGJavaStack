package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DemoLinkedList 
{

	public static void main(String[] args) 
	{
		Stack list2=new Stack();
		list2.push("MAnojkumar");
		list2.push('C');
		list2.push(98765456544l);
		list2.push(3.6f);
		System.out.println(list2);
		list2.pop();
		System.out.println(list2);
		System.out.println(list2.peek());
		System.out.println(list2.empty());
		System.out.println(list2.search('C'));
		
//		LinkedList list=new LinkedList();//Generic
//		LinkedList<String> list1=new LinkedList<String>();//NOn-Generic
//		list1.add("Manojkumar");
//		list1.add("Rajan");
//		list1.add("Rajya");
//		list1.add("Annamalai");
//		
//		Iterator i=list1.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
//		list.add("Manojkumar");
//		list.add('A');
//		list.addFirst(9789355948L);//will be added first
//		list.add(9.8f);
//		
//		list.add(2, 89.7f);//Index,Object
//		list.remove(4);
//		
//		System.out.println(list);
//		System.out.println(list.contains("Manojkumar"));
//		list.set(1, "Gajarajan");//ITs updated a object
//		list.add("Gajarajan");
//		System.out.println(list);
//		list.clear();//Deleted all Elements
//		System.out.println(list);
//		System.out.println(list1.get(0));//Get a value
//		System.out.println(list1.indexOf("Rajan"));//get a index
	
	}

}
