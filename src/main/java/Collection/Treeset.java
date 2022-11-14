package Collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset 
{

	public static void main(String[] args) 
	{
	 TreeSet<MobilePhones> Poorvika=new TreeSet<MobilePhones>();
	 Poorvika.add(new MobilePhones("Realme7", 4, 17800.89));
	 Poorvika.add(new MobilePhones("Nokia", 2, 11800.89));
	 Poorvika.add(new MobilePhones("Samsung", 1, 5800.89));
	 Poorvika.add(new MobilePhones("Apple", 6, 67800.89));
	 Poorvika.add(new MobilePhones("onePLus", 8, 57800.89));
	 MobilePhones obj=new MobilePhones("Vivo-y13", 2, 8000.8);
	 Poorvika.add(obj);
	
	 //System.out.println(Poorvika);
	 Iterator i=Poorvika.iterator();
	 while(i.hasNext())
	 {
		 System.out.println(i.next());
	 }
	// obj.compareTo(Poorvika);
	}
}

class MobilePhones implements Comparable<MobilePhones>
{
	String mobilename;
	Integer ram;
	Double price;

//	public MobilePhones(String mobileName, Integer ram, Double price) {
//		super();
//		MobileName = mobileName;
//		Ram = ram;
//		Price = price;
//	}

	@Override
	public String toString() {
		return "MobilePhones [mobilename=" + mobilename + ", ram=" + ram + ", price=" + price + "]";
	}

	public MobilePhones(String mobilename, Integer ram, Double price) {
		super();
		this.mobilename = mobilename;
		this.ram = ram;
		this.price = price;
	}

	public MobilePhones() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public int compareTo(MobilePhones ab) {
		// TODO Auto-generated method stub
		return ab .ram.compareTo(this.ram);
		//return this.price.compareTo(o.price);

}
}

	
