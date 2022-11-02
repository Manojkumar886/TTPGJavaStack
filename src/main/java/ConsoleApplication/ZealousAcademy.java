package ConsoleApplication;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter setter and tostring
@NoArgsConstructor
@AllArgsConstructor//ZealousAcademy obj=new ZealousAcademy(String studentn..........);
public class ZealousAcademy 
{
	private String studentName;
	private String studentTechnology;
	private String studentIncharge;
	private int studentMemberscount;
	private double studentHours;
	private double studentCourseprice;


}
