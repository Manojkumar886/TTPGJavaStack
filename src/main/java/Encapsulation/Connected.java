package Encapsulation;

public class Connected {

	public static void main(String[] args)
	{
		EmployeeDetails obj=new EmployeeDetails();
		obj.setEmpname("Thivin");
		System.out.println(obj.getEmpname());
		obj.setEmpid(9876);
		obj.setEmpSalary(3.6);
		System.out.println(obj.getEmpid());
		System.out.println(obj.getEmpSalary());
		
	}

}
