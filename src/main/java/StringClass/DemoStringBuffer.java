package StringClass;

public class DemoStringBuffer {

	public static void main(String[] args) 
	{
		StringBuffer buff=new StringBuffer("Hello");
		String buff1=new String("Hello");
//		buff.append("Apsheya");//HelloApsheya
//		System.out.println(buff);
//		buff.insert(12, "priya");//HelloApsheya-HelloApsheyapriya
//		System.out.println(buff);
//		buff.replace(1, 5, "egg");
//		System.out.println(buff);//HeggApsheyapriya
//		buff.delete(1, 4);
//		System.out.println(buff);//HApsheyapriya
//		buff.reverse();
//		System.out.println(buff);//ayirpayehspAH
		
		buff.append("Ganesh");
		System.out.println(buff);//HelloGanesh
		buff.insert(5, "Vishnu");
		System.out.println(buff);//HelloVishnuGanesh
		buff.replace(5,11, "Developer");
		System.out.println(buff);//HelloDeveloperGanesh
		buff.reverse();
		System.out.println(buff);//hsenaGrepoleveDolleH
		buff.reverse();
		System.out.println(buff);//
		
		
	}

}
