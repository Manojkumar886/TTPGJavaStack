package ConsoleApplication;

import java.util.Arrays;
import java.util.Scanner;

public class Connection implements ZealousAcademyActions
{
	 ZealousAcademy [] academy=new ZealousAcademy[6];
	Scanner scan=new Scanner(System.in);
	public Connection()
	{
		academy[0]=new ZealousAcademy("Manojkumar","JavaFullStack", "Razak", 2,2.00 , 20000.0);
		academy[1]=new ZealousAcademy("Thivin","PythonFullStack", "Annamalai", 4,1.00 , 35000.0);
		academy[2]=new ZealousAcademy("Thilak","JavaFullStack", "Raseedha", 5,2.40 , 10000.0);
		academy[3]=new ZealousAcademy("Vishnu","C#", "Manojkumar", 4,1.30 , 14000.0);
		academy[4]=new ZealousAcademy("Ganesh","Testing", "Aarthi", 10,1.10 , 35000.0);
		academy[5]=new ZealousAcademy("Pradeep","PHP", "Sabari", 1,2.30 , 20000.0);
	//	academy[6]=new ZealousAcademy(null, null, null, 0, 0, 0)
		
	}

	public static void main(String[] args) 
	{
		Connection connect=new Connection();
		//System.out.println(Arrays.toString(academy));
		do
		{
			System.out.println("which process you want 1.addnewstudnetdetails\n2.List\n3.Update\n4.Search\n5.Sort\n6.Delete\n7.Exit");
			int menu=connect.scan.nextInt();
			switch(menu)
			{
			case 1:
				System.out.println("new student details is created by you StudentName,technology,incharge,memberscount,Hours,price");
				ZealousAcademy z1=new ZealousAcademy(connect.scan.next(), connect.scan.next(), connect.scan.next(),connect.scan.nextInt(),connect.scan.nextDouble(), connect.scan.nextDouble());
				System.out.println(connect.addnewstudentdetails(z1));
				break;
				
			case 2:
				System.out.println("your values is listed");
				connect.Listallstudentdetails();
				break;
			case 3:
				System.out.println("which student name you want update");
				String stud=connect.scan.next();
				connect.updateStudentdetails(stud);
				break;
			case 4:
				System.out.println("search based on technolgy");
				System.out.println("which technology you want search");
				String tech=connect.scan.next();
				connect.searchStduentdetails(tech);
				break;
			case 5:
				System.out.println("your values is sorted");
			case 6:
				System.out.println("which name you want to delete in academic");
				String nm=connect.scan.next();
				connect.DeleteStduentdetails(nm);
			}
			
			
		}
		while(true);
		
	}

	@Override
	public String addnewstudentdetails(ZealousAcademy zealous) 
	{
		for(int index=0;index<academy.length;index++)
		{
			if(academy[index]==null)
			{
				academy[index]=zealous;
				return zealous.getStudentName()+"has name is added succesfully";
			}
		}
		return zealous.getStudentName()+"has name is not added";
	}

	@Override
	public void Listallstudentdetails()
	{
		for(ZealousAcademy zea:academy)
		{
			System.out.println(zea);
		}
	}

	@Override
	public void updateStudentdetails(String name) 
	{
		for(int index=0;index<academy.length;index++)
		{
			if(academy[index].getStudentName().equalsIgnoreCase(name))
			{
				System.out.println(name+"which field you want to update");
				System.out.println(academy[index]);
				//System.out.println("that fields are studentname,inchargename,members");
				String field=scan.next();
				switch(field)
				{
				case "studentname":
					System.out.println("try to youe new student name");
					String newstud=scan.next();
					academy[index].setStudentName(newstud);
					break;
				}
				System.out.println(field+"has been updated");	
			}
			
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
	return;
	}

	@Override
	public void SortStudentdetails() 
	{
		Arrays.sort(academy);
		System.out.println(Arrays.toString(academy));
		
		
	}

	@Override
	public void DeleteStduentdetails(String name)
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
		System.out.println(name+"has't deleted....");
	}

}
