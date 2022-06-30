package week3.day1.assignment4;

public class Students {
	public void getStudentInfo()
	{
		System.out.println("studentInformation");
	}
	public static void main(String[] args) {
		
		Students s = new Students();
		System.out.println(s.studentInfo1(9));
		System.out.println(s.studentInfo2("sanjana","\n sanjana@gmail.com"));
		System.out.println(s.studentInfo3(894561237));
		
			
	}
	
	public int studentInfo1(int id) {
		
		return id;
		
	}
	public String studentInfo2(String name,String email) {
	
	return name+email;
	

	}
	public int studentInfo3(int ph)
	{
		return ph;
	}
	


}

