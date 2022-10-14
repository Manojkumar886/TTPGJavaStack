package StringClass;

public class DemoStringBuffer {

	public static void main(String[] args) 
	{
		StringBuffer buff=new StringBuffer("Hello");
		buff.append("Apsheya");//HelloApsheya
		System.out.println(buff);
		buff.insert(12, "priya");//HelloApsheya-HelloApsheyapriya
		System.out.println(buff);
		buff.replace(1, 5, "egg");
		System.out.println(buff);//HeggApsheyapriya
		buff.delete(1, 4);
		System.out.println(buff);//HApsheyapriya
		buff.reverse();
		System.out.println(buff);//ayirpayehspAH
		
		
	}

}
