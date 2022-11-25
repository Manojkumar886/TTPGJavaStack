package Encapsulation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetails
{
	private String empname;
	private int empid;
	private double empSalary;
	
//	@Override
//	public String toString() {
//		return "EmployeeDetails [empname=" + empname + ", empid=" + empid + ", empSalary=" + empSalary + "]";
//	}
//
//	public EmployeeDetails() 
//	{
//		super();
//		System.out.println("welcome to constructor");
//		// TODO Auto-generated constructor stub
//	}
//
//	public EmployeeDetails(String empname,int empid,double empSalary1)
//	{
//		this.empname=empname;
//		this.empid=empid;
//		empSalary=empSalary1;
//	}
//	
//	public String getEmpname() {
//		return empname;
//	}
//	public void setEmpname(String empnames) {
//		empname = empnames;
//	}
//	public int getEmpid() {
//		return empid;
//	}
//	public void setEmpid(int empid) {
//		this.empid = empid;
//	}
//	public double getEmpSalary() {
//		return empSalary;
//	}
//	public void setEmpSalary(double empSalary) {
//		this.empSalary = empSalary;
//	}

}
