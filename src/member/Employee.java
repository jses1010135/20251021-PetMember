package member;
import java.util.Date;
public class Employee {
	private int EmpID;
	private String EmpName;
	private String EmpGender;
	private String EmpTitle;
	private Date EmpSDate;
	private Date Empbirth;
	private float EmpHeight;
	
	public Employee() {
		
	}
	
	public Employee(int empID,String empName,String empGender,
			String empTitle,Date empbirth,float empHeight,float empWeight) 
	{
		this.setEmpID(empID);
		this.setEmpName(empName);
		this.setEmpGender(empGender);
		this.setEmpGender(empGender);
		this.setEmpTitle(empTitle);
		this.setEmpSDate(empbirth);
		this.setEmpbirth(empbirth);
		this.setEmpHeight(empHeight);
		this.setEmpWeight(empWeight);
		
	}
	
	public int getEmpID() {
		return EmpID;
	}
	public void setEmpID(int empID) {
		EmpID = empID;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpGender() {
		return EmpGender;
	}
	public void setEmpGender(String empGender) {
		EmpGender = empGender;
	}
	public String getEmpTitle() {
		return EmpTitle;
	}
	public void setEmpTitle(String empTitle) {
		EmpTitle = empTitle;
	}
	public Date getEmpSDate() {
		return EmpSDate;
	}
	public void setEmpSDate(Date empSDate) {
		EmpSDate = empSDate;
	}
	public Date getEmpbirth() {
		return Empbirth;
	}
	public void setEmpbirth(Date empbirth) {
		Empbirth = empbirth;
	}
	public float getEmpHeight() {
		return EmpHeight;
	}
	public void setEmpHeight(float empHeight) {
		EmpHeight = empHeight;
	}
	public float getEmpWeight() {
		return EmpWeight;
	}
	public void setEmpWeight(float empWeight) {
		EmpWeight = empWeight;
	}
	private float EmpWeight;
}

