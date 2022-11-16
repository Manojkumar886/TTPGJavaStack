package ConsoleApplication;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data//getter setter and tostring
@NoArgsConstructor
@AllArgsConstructor//ZealousAcademy obj=new ZealousAcademy(String studentn..........);
public class ZealousAcademy  implements Comparable<ZealousAcademy>,Serializable
{
	private String studentName;
	private String studentTechnology;
	private String studentIncharge;
	private int studentMemberscount;
	private double studentHours;
	private double studentCourseprice;
	@Override
	public int compareTo(ZealousAcademy o) {
		// TODO Auto-generated method stub
		return this.studentName.compareTo(o.studentName);
	}


}
