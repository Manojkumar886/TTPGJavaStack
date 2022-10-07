package Collection;

import java.util.ArrayList;
import java.util.Vector;

public class DemoArrayListandVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj=new ArrayList();
		obj.add("Manojkumar");
		obj.add(434);
		obj.add(987654345765L);
		obj.add(89.9f);
		obj.add(true);	
		System.out.println("BEfore Retained Values"+obj);
		Vector obj1=new Vector();
		obj1.add("Manojkumar");
		obj1.add(434);
		obj1.add(987654345765L);
		obj1.removeAll(obj);
		System.out.println("Removed Values"+obj1);
		obj.retainAll(obj1);
		System.out.println("Retained Values"+obj1);
		
		
		
//		obj1.addAll(obj);
//		obj1.add(4567);
//		System.out.println("Arraylistv values"+obj);
//		System.out.println("Vector values " +obj1);
////		obj1.remove(true);
//		obj1.removeAll(obj);
//		System.out.println("Vector removed values " +obj1);
//		obj.retainAll(obj1);
//		System.out.println("REtained Values"+obj1);

	}

}
