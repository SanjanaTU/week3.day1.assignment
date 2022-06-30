package week3.day1.assignment1;

public class DesktopSize extends Computer{
	
	public void desktopSize()
	{
		System.out.println("1920x1080");
	}

	public static void main(String[] agrs) {
		
		DesktopSize ds = new DesktopSize();
		ds.desktopSize();
		ds.computerModel();
	}
}
