package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class DemoSets {

	public static void main(String[] args) 
	{
		HashSet<Double> obj=new HashSet<Double>();
		obj.add(56.6);
		obj.add(16.4);
		obj.add(99.9);
		obj.add(346.46);
		obj.add(99.9);
		obj.add(22.2);
		obj.add(536.6);
//		Iterator i=obj.iterator();
//		while(i.hasNext())
//		{
//			System.out.println(i.next());
//		}
		System.out.println(obj);
		TreeSet<Double> obj1=new TreeSet<Double>();
		obj1.addAll(obj);
		System.out.println(obj1);
		
		
	}

}
