package week3.day1.assignment2;

public class Student extends College{
	
	public void studentName()
	{
		System.out.println("sanjana");
		
	}
	public void studentDept()
	{
		System.out.println("IT");
	}
	public void studentId()
	{
		System.out.println("789451");
	}
	
	public static void main(String[] agrs)
	{
		Student ss= new Student();
		ss.studentName();
		ss.studentDept();
		ss.studentId();
		
		Department dd= new Department();
		dd.deptName();
		
		College cc = new College();
		cc.collegeName();
		cc.collegeCode();
		cc.collegeRank();
		
		
	}
}
