package Encapsulation;

public class Connected {

	public static void main(String[] args)
	{
		EmployeeDetails obj=new EmployeeDetails();
		EmployeeDetails obj1=new EmployeeDetails("Manoj", 22, 3.6);
		//EmployeeDetails obj2=new 
		EmployeeDetails obj2=new EmployeeDetails("Pradeep", 24, 6.8);
		System.out.println(obj2);
		System.out.println(obj1);
		obj.setEmpname("Thivin");
		System.out.println(obj.getEmpname());
		obj.setEmpid(9876);
		obj.setEmpSalary(3.6);
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmpSalary());
		
	}

}
