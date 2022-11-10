package ConsoleApplication;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ZealousAcademyAccess implements Runnable,ZealousAcademyActions
{
	 ZealousAcademy [] academy=new ZealousAcademy[6];
		Scanner scan=new Scanner(System.in);
		public ZealousAcademyAccess()
		{
			academy[0]=new ZealousAcademy("Manojkumar","JavaFullStack", "Razak", 2,2.00 , 20000.0);
			academy[1]=new ZealousAcademy("Thivin","PythonFullStack", "Annamalai", 4,1.00 , 35000.0);
			academy[2]=new ZealousAcademy("Thilak","JavaFullStack", "Raseedha", 5,2.40 , 10000.0);
			academy[3]=new ZealousAcademy("Vishnu","C#", "Manojkumar", 4,1.30 , 14000.0);
			academy[4]=new ZealousAcademy("Ganesh","Testing", "Aarthi", 10,1.10 , 35000.0);
			academy[5]=new ZealousAcademy("Pradeep","PHP", "Sabari", 1,2.30 , 20000.0);
		
			
		}

	@Override
	public String addnewstudentdetails(ZealousAcademy zealous) 
	{
		try
		{
			for(int index=0;index<academy.length;index++)
			{
				if(academy[index]==null)
				{
					academy[index]=zealous;
					return zealous.getStudentName()+"has name is added succesfully";
				}
			}
			throw new ZealousAcademyException();
		}
		catch(ZealousAcademyException exe)
		{
			System.out.println(exe+"memory is full,so if you need any one data is deleted");
			for(ZealousAcademy zea:academy)
			{
				System.out.println(zea.getStudentName());
			}
			System.out.println("which name you want delete");
			DeleteStduentdetails(scan.next());//delete method
			addnewstudentdetails(zealous);	
		}
		return zealous.getStudentName()+"has name is added succesfully";	
	}

	@Override
	public void Listallstudentdetails() {
		for(ZealousAcademy zea:academy)
		{
			System.out.println(zea);
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateStudentdetails(String name) 
	{
		try
		{
			for(int index=0;index<academy.length;index++)
			{
				if(academy[index].getStudentName().equalsIgnoreCase(name))
				{
					try
					{
						System.out.println(name+"which field you want to update");
						System.out.println(academy[index]);
						//System.out.println("that fields are studentname,inchargename,members");
						String field=scan.next();
						switch(field)
						{
						case "studentName":
							System.out.println("try to youe new student name");
							String newstud=scan.next();
							academy[index].setStudentName(newstud);
							break;
						case "studentTechnology":
							System.out.println("try to your new technology name");
							String tech=scan.next();
							academy[index].setStudentTechnology(tech);
							break;
						case "studentIncharge":
							System.out.println("try to your new Incharge name");
							String inch=scan.next();
							academy[index].setStudentIncharge(inch);
							break;
						case "studentMemberscount":
							System.out.println("try to your new Memberscount");
							int count=scan.nextInt();
							academy[index].setStudentMemberscount(count);
							break;
						case "studentHours":
							System.out.println("try to your new Hours details");
							double hours=scan.nextDouble();
							academy[index].setStudentHours(hours);
							break;
						case "studentCourseprice":
							System.out.println("try to your new price details");
							double price=scan.nextDouble();
							academy[index].setStudentCourseprice(price);
							break;
							default:throw new ZealousAcademyException();
							
						}
						System.out.println(field+"has been updated"+name);
						return;
					}
					catch (ZealousAcademyException | InputMismatchException e) 
					{
						Scanner scan=new Scanner(System.in);
						
						System.out.println(name+"youe field name is wrong ,please enter correct value \n studentName,studentTechnology,studentIncharge,studentMemberscount,studentHours,studentCourseprice ");
						System.out.println(academy[index]);
						//System.out.println("that fields are studentname,inchargename,members");
						String field=scan.next();
						switch(field)
						{
						case "studentName":
							System.out.println("try to youe new student name");
							String newstud=scan.next();
							academy[index].setStudentName(newstud);
							break;
						case "studentTechnology":
							System.out.println("try to your new technology name");
							String tech=scan.next();
							academy[index].setStudentTechnology(tech);
							break;
						case "studentIncharge":
							System.out.println("try to your new Incharge name");
							String inch=scan.next();
							academy[index].setStudentIncharge(inch);
							break;
						case "studentMemberscount":
							System.out.println("try to your new Memberscount");
							int count=scan.nextInt();
							academy[index].setStudentMemberscount(count);
							break;
						case "studentHours":
							System.out.println("try to your new Hours details");
							double hours=scan.nextDouble();
							academy[index].setStudentHours(hours);
							break;
						case "studentCourseprice":
							System.out.println("try to your new price details");
							double price=scan.nextDouble();
							academy[index].setStudentCourseprice(price);
							break;
							default:throw new ZealousAcademyException();
							
						}
						System.out.println(field+"has been updated"+name);
						return;
						
					}
				}
			}
			throw new ZealousAcademyException();
		}
		catch(ZealousAcademyException exe)
		{
			System.out.println(exe+"enter your correct student value");
			for(ZealousAcademy zea:academy)
			{
				System.out.println(zea.getStudentName());
			}
			System.out.println("which value you update");
			updateStudentdetails(scan.next());
		}

		
	}

	@Override
	public void searchStduentdetails(String technology)
	{
		System.out.println("i have trying to serach for technologies"+technology);
		for(int index=0;index<academy.length;index++)
		{
			if(academy[index].getStudentTechnology().equalsIgnoreCase(technology))
			{
				System.out.println(academy[index]);
			}
		}

	}

	@Override
	public void SortStudentdetails() 
	{
		ZealousAcademy zealous=null;
		System.out.println("based on what field you want sort");
		String field=scan.next();
		for(int index=0;index<academy.length;index++)
		{
			for(int pos=index+1;pos<academy.length;pos++)
			{
				if(field.equalsIgnoreCase("studentname"))
				{
					if(academy[index].getStudentName().compareTo(academy[pos].getStudentName())>0)
					{
						zealous=academy[index];
						academy[index]=academy[pos];
						academy[pos]=zealous;
					}
				}
				else if(field.equalsIgnoreCase("studentMemberscount"))
				{
					if(academy[index].getStudentMemberscount()>=academy[pos].getStudentMemberscount())
					{
						zealous=academy[index];
						academy[index]=academy[pos];
						academy[pos]=zealous;
					}
				}
				else if(field.equalsIgnoreCase("studentHours"))
				{
					if(academy[index].getStudentHours()>=academy[pos].getStudentHours());
					{
						zealous=academy[index];
						academy[index]=academy[pos];
						academy[pos]=zealous;
					}
				}
				else if(field.equalsIgnoreCase("studentCourseprice"))
				{
					if(academy[index].getStudentCourseprice()>=academy[pos].getStudentCourseprice());
					{
						zealous=academy[index];
						academy[index]=academy[pos];
						academy[pos]=zealous;
					}
				}
				else if(field.equalsIgnoreCase("studentTechnology"))
				{
					if(academy[index].getStudentTechnology().compareTo(academy[pos].getStudentTechnology())>0)
					{
						zealous=academy[index];
						academy[index]=academy[pos];
						academy[pos]=zealous;
					}
				}
				else if(field.equalsIgnoreCase("studentIncharge"))
				{
					if(academy[index].getStudentIncharge().compareTo(academy[pos].getStudentIncharge())>0)
					{
						zealous=academy[index];
						academy[index]=academy[pos];
						academy[pos]=zealous;
					}
				}
			}
		}
	}

	@Override
	public void DeleteStduentdetails(String name) 
	{
		try
		{
			for(int index=0;index<academy.length;index++)
			{
				if(academy[index].getStudentName().equalsIgnoreCase(name))
				{
					academy[index]=null;
					System.out.println(name+"has been deleted succesfully");
					return;
				}
			}
			throw new ZealousAcademyException();
		}
		catch(ZealousAcademyException exe)
		{
			System.out.println(exe+"name is not matching,please matching values are");
			for(ZealousAcademy aca:academy)
			{
				System.out.println(aca.getStudentName());
			}
			System.out.println("please which name you want delete");
			DeleteStduentdetails(scan.next());
		}
		System.out.println(name+"has deleted.");

	}

	@Override
	synchronized public void run() 
	{
		System.out.println("welcome to zealousAcademy -"+Thread.currentThread().getName());
		do
		{
			System.out.println("which process you want\n 1.addnewstudnetdetails\n2.List\n3.Update\n4.Search\n5.Sort\n6.Delete\n7.Exit");
			int menu=scan.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("new student details is created by you StudentName,technology,incharge,memberscount,Hours,price");
				ZealousAcademy z1=new ZealousAcademy(scan.next(), scan.next(), scan.next(),scan.nextInt(),scan.nextDouble(), scan.nextDouble());
				System.out.println(addnewstudentdetails(z1));
				break;
				
			case 2:
				System.out.println("your values is listed");
				Listallstudentdetails();
				break;
			case 3:
				System.out.println("which student name you want update");
				String stud=scan.next();
				updateStudentdetails(stud);
				Listallstudentdetails();
				break;
			case 4:
				System.out.println("search based on technolgy");
				System.out.println("which technology you want search");
				String tech=scan.next();
				searchStduentdetails(tech);
				break;
			case 5:
				SortStudentdetails();
				break;
				
			case 6:
				System.out.println("which name you want to delete in academic");
				String nm=scan.next();
				DeleteStduentdetails(nm);
				break;
			default: return;
			}
		}
		while(true);
		
	}
	

}
