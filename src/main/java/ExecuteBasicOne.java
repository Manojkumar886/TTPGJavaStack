import AccessMOdifiers.BasicOne;

public class ExecuteBasicOne extends BasicOne 
{
	public static void main(String[] args) 
	{
		BasicOne one=new BasicOne();
		one.result();
		ExecuteBasicOne one1=new ExecuteBasicOne();
		one1.sort();
		one1.result();
	}

}
